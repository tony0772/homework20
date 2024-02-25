package org.fasttrackit.homework20;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String text;
    private String reviewer;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
