package nutricalc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private Long productId;
    private String description;
}
