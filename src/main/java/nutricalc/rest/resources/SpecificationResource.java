package nutricalc.rest.resources;

import nutricalc.core.models.entities.Specification;
import org.springframework.hateoas.ResourceSupport;

public class SpecificationResource extends ResourceSupport {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String name, String producer) {
        this.name = name;
        this.producer = producer;
        this.title = name + " (" + producer + ")";
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

    public void setSaturatedFats(double saturatedFats) {
        this.saturatedFats = saturatedFats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates, double sugars) {
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Specification toSpecification() {
        Specification specification = new Specification();
        specification.setTitle(name, producer);
        specification.setEnergyKj(energyKj);
        specification.setEnergyKCal(energyKCal);
        specification.setCarbohydrates(carbohydrates, sugars);
        specification.setFats(fats, saturatedFats);
        specification.setProtein(protein);
        specification.setSalt(salt);
        specification.setComment(comment);
        return specification;
    }
}
