package nutricalc.rest.mvc;

import lombok.extern.slf4j.Slf4j;
import nutricalc.core.models.entities.Specification;
import nutricalc.core.services.SpecificationService;
import nutricalc.core.services.util.SpecificationList;
import nutricalc.rest.resources.SpecificationListResource;
import nutricalc.rest.resources.SpecificationResource;
import nutricalc.rest.resources.asm.SpecificationListResourceAsm;
import nutricalc.rest.resources.asm.SpecificationResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/rest/specifications")
@Slf4j
public class SpecificationController {

    private SpecificationService specificationService;

    @Autowired
    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @RequestMapping(method = GET)
    public ResponseEntity<SpecificationListResource> findAllSpecifications() {
        log.debug("SpecificationController.findAllSpecifications");
        SpecificationList specificationList = specificationService.findAllSpecifications();
        SpecificationListResource specificationListResource = new SpecificationListResourceAsm().toResource(specificationList);
        return new ResponseEntity<>(specificationListResource, OK);
    }

    @RequestMapping(value = "/searchSpecification", params = {"s"}, method = GET)
    public ResponseEntity<SpecificationListResource> searchSpecifications(
            @RequestParam(value = "s") String searchString) {
        log.debug("SpecificationController.searchSpecifications");
        log.debug("searchString = " + searchString);
        SpecificationList specificationList = specificationService.searchSpecificationsByTitle(searchString);
        SpecificationListResource specificationListResource = new SpecificationListResourceAsm().toResource(specificationList);
        return new ResponseEntity<>(specificationListResource, OK);
    }

    @RequestMapping(value = "/addSpecification", method = POST)
    public ResponseEntity<SpecificationResource> addSpecification(
            @RequestBody SpecificationResource sentSpecification) {
        log.debug("SpecificationController.addSpecification");
        Specification addedSpecification = specificationService.addSpecification(sentSpecification.toSpecification());
        SpecificationResource createdResource = new SpecificationResourceAsm().toResource(addedSpecification);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(createdResource.getLink("self").getHref()));
        return new ResponseEntity<>(createdResource, headers, CREATED);
    }

    @RequestMapping(value = "/{specificationId}", method = GET)
    public ResponseEntity<SpecificationResource> getSpecification(
            @PathVariable Long specificationId) {
        log.debug("SpecificationController.getSpecification");
        Specification specification = specificationService.getSpecification(specificationId);
        if (specification != null) {
            SpecificationResource res = new SpecificationResourceAsm().toResource(specification);
            return new ResponseEntity<>(res, OK);
        } else {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

}
