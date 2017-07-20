package nutricalc.rest.mvc;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.services.SpecificationService;
import nutricalc.core.services.util.SpecificationList;
import nutricalc.rest.resources.SpecificationListResource;
import nutricalc.rest.resources.SpecificationResource;
import nutricalc.rest.resources.asm.SpecificationListResourceAsm;
import nutricalc.rest.resources.asm.SpecificationResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Controller
@RequestMapping("/rest/specifications")
public class SpecificationController {

    private SpecificationService specificationService;

    @Autowired
    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<SpecificationListResource> findAllSpecifications() {
        System.out.println("SpecificationController.findAllSpecifications");
        SpecificationList specificationList = specificationService.findAllSpecifications();
        SpecificationListResource specificationListResource = new SpecificationListResourceAsm().toResource(specificationList);
        return new ResponseEntity<>(specificationListResource, HttpStatus.OK);
    }

    @RequestMapping(value = "/searchSpecification",
            params = {"s"},
            method = RequestMethod.GET)
    public ResponseEntity<SpecificationListResource> searchSpecifications(
            @RequestParam(value = "s") String searchString) {
        System.out.println("SpecificationController.searchSpecifications");
        System.out.println("searchString = " + searchString);
        SpecificationList specificationList = specificationService.searchSpecificationsByTitle(searchString);
        SpecificationListResource specificationListResource = new SpecificationListResourceAsm().toResource(specificationList);
        return new ResponseEntity<>(specificationListResource, HttpStatus.OK);
    }

    @RequestMapping(value = "/addSpecification", method = RequestMethod.POST)
    public ResponseEntity<SpecificationResource> addSpecification(
            @RequestBody SpecificationResource sentSpecification) {
        System.out.println("SpecificationController.addSpecification");
        Specification addedSpecification = specificationService.addSpecification(sentSpecification.toSpecification());
        SpecificationResource createdResource = new SpecificationResourceAsm().toResource(addedSpecification);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(createdResource.getLink("self").getHref()));
        return new ResponseEntity<>(createdResource, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{specificationId}", method = RequestMethod.GET)
    public ResponseEntity<SpecificationResource> getSpecification(
            @PathVariable Long specificationId) {
        System.out.println("SpecificationController.getSpecification");
        Specification specification = specificationService.getSpecification(specificationId);
        if (specification != null) {
            SpecificationResource res = new SpecificationResourceAsm().toResource(specification);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
