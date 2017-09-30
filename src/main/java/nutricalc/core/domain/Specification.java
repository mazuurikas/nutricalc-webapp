package nutricalc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static java.lang.String.format;

@Entity
@Data
@NoArgsConstructor
public class Specification {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String producer;
    private String comment;
    private double energyKj;
    private double energyKCal;
    private double fats;
    private double saturatedFats;
    private double carbohydrates;
    private double sugars;
    private double protein;
    private double salt;

    public String getTitle() {
        return format("%s (%s)", name, producer);
    }

    public void setFats(double fats, double saturatedFats) {
        this.fats = fats;
        this.saturatedFats = saturatedFats;
    }

    public void setCarbohydrates(double carbohydrates, double sugars) {
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
    }
}
