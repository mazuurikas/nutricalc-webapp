package nutricalc.rest.resources;

import lombok.Data;
import lombok.EqualsAndHashCode;
import nutricalc.core.models.entities.Specification;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = true)
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
