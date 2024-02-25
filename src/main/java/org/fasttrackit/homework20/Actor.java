package org.fasttrackit.homework20;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
@Data
@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int birthYear;

    @ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Movie> movies;
}
