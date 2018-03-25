package nutricalc.domain;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "recipe_id")
    private Set<RecipeLine> lines;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<RecipeLine> getLines() {
        return lines;
    }

    public void setLines(Set<RecipeLine> lines) {
        this.lines = lines;
    }
}
