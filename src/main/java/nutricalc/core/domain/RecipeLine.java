package nutricalc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class RecipeLine {
    @Id
    @GeneratedValue
    private Long id;
    private int amount;
    @ManyToOne
    @JoinColumn
    private Specification specification;
}
