package nutricalc.core.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Specification {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String producer;
    private String title;
    private double energyKj;
    private double energyKCal;
    private double fats;
    private double saturatedFats;
    private double carbohydrates;
    private double sugars;
    private double protein;
    private double salt;
    private String comment;

    public void setTitle(String name, String producer) {
        this.name = name;
        this.producer = producer;
        this.title = name + " (" + producer + ")";
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
