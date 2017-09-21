package nutricalc.rest.resources.asm;

import nutricalc.core.domain.Specification;
import nutricalc.rest.mvc.SpecificationController;
import nutricalc.rest.resources.SpecificationResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class SpecificationResourceAsm extends ResourceAssemblerSupport<Specification, SpecificationResource> {

    public SpecificationResourceAsm() {
        super(SpecificationController.class, SpecificationResource.class);
    }

    @Override
    public SpecificationResource toResource(Specification specification) {
        SpecificationResource resource = new SpecificationResource();
        resource.setTitle(specification.getName(), specification.getProducer());
        resource.setEnergyKj(specification.getEnergyKj());
        resource.setEnergyKCal(specification.getEnergyKCal());
        resource.setCarbohydrates(specification.getCarbohydrates(), specification.getSugars());
        resource.setFats(specification.getFats(), specification.getSaturatedFats());
        resource.setProtein(specification.getProtein());
        resource.setSalt(specification.getSalt());
        resource.setComment(specification.getComment());
        resource.add(linkTo(SpecificationController.class).slash(specification.getId()).withSelfRel());
        return resource;
    }
}
