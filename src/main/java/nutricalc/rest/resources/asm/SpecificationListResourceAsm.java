package nutricalc.rest.resources.asm;

import nutricalc.core.services.util.SpecificationList;
import nutricalc.rest.mvc.SpecificationController;
import nutricalc.rest.resources.SpecificationListResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class SpecificationListResourceAsm extends ResourceAssemblerSupport<SpecificationList, SpecificationListResource> {

    public SpecificationListResourceAsm() {
        super(SpecificationController.class, SpecificationListResource.class);
    }

    @Override
    public SpecificationListResource toResource(SpecificationList specificationList) {
        SpecificationListResource res = new SpecificationListResource();
        res.setSpecifications(new SpecificationResourceAsm().toResources(specificationList.getSpecifications()));
        return res;
    }
}
