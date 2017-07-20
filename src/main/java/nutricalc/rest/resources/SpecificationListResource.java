package nutricalc.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

public class SpecificationListResource extends ResourceSupport {
    private List<SpecificationResource> specifications = new ArrayList<>();

    public List<SpecificationResource> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<SpecificationResource> specifications) {
        this.specifications = specifications;
    }
}
