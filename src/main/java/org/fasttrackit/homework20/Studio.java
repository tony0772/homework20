package org.fasttrackit.homework20;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
@Data
@Entity
public class Studio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "studio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Movie> movies;
}
