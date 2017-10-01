package nutricalc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "recipe_id")
    private Set<RecipeLine> lines;
}
