package org.baydak.service;

import lombok.RequiredArgsConstructor;
import org.baydak.models.GameAuthor;
import org.baydak.repository.GameRepository;
import org.baydak.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private AuthorRepository authorRepository;
    private GameRepository gameRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository, GameRepository gameRepository) {
        this.authorRepository = authorRepository;
        this.gameRepository = gameRepository;
    }

    public List<GameAuthor> getAuthors() {
        return authorRepository.findAll();
    }

    public GameAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).get();
    }

    public void addAuthor(GameAuthor author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(GameAuthor author) {
        gameRepository.deleteAll(author.getGames());
        authorRepository.delete(author);
    }

    public void updateAuthor(Long id, GameAuthor updatedAuthor) {
        GameAuthor author = getAuthorById(id);
        author.setNickname(updatedAuthor.getNickname());
        author.setBirthDate(updatedAuthor.getBirthDate());
        addAuthor(author);
    }

    public List<GameAuthor> orderedAuthorsByNickname() {
        return authorRepository.findAll(Sort.by("nickname"));
    }

    public List<GameAuthor> orderedAuthorsByBirthDate() {
        return authorRepository.findAll(Sort.by("birthDate"));
    }
}
