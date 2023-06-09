package org.baydak.repository;

import org.baydak.models.GameAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<GameAuthor, Long> {
    GameAuthor findById(long id);
}
