package nutricalc.core.models.entities;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setSaturatedFats(double saturatedFats) {
        this.saturatedFats = saturatedFats;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String name, String producer){
        this.name = name;
        this.producer = producer;
        this.title = name + " (" + producer + ")";
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
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

    public void setFats(double fats, double saturatedFats) {
        this.fats = fats;
        this.saturatedFats = saturatedFats;
    }

    public double getSaturatedFats() {
        return saturatedFats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getSugars() {
        return sugars;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCarbohydrates(double carbohydrates, double sugars) {
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
    }
}
