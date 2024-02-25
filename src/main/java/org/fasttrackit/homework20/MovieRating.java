package org.fasttrackit.homework20;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MovieRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int rating;
    private String agency;

    @OneToOne
    @JoinColumn(name = "movie_id", unique = true)
    private Movie movie;
}
