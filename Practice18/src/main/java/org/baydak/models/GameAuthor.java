package org.baydak.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
public class GameAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nickname")
    private String nickname;

    @Column(name = "birth_date")
    private String birthDate;

    @OneToMany(mappedBy = "gameAuthor", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Game> games;
}
