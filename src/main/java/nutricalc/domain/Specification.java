package nutricalc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getEnergyKj() {
        return energyKj;
    }

    public void setEnergyKj(double energyKj) {
        this.energyKj = energyKj;
    }

    public double getEnergyKCal() {
        return energyKCal;
    }

    public void setEnergyKCal(double energyKCal) {
        this.energyKCal = energyKCal;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getSaturatedFats() {
        return saturatedFats;
    }

    public void setSaturatedFats(double saturatedFats) {
        this.saturatedFats = saturatedFats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }
}
