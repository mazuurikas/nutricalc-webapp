package nutricalc.domain;

import javax.persistence.*;

@Entity
public class RecipeLine {
    @Id
    @GeneratedValue
    private Long id;
    private int amount;
    @ManyToOne
    @JoinColumn
    private Specification specification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
