package nutricalc.core.services;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.services.util.SpecificationList;

import java.util.List;

public interface SpecificationService {

    public Specification addSpecification(Specification data);

    public SpecificationList searchSpecificationsByTitle(String specificationTitle);

    public Specification getSpecification(Long id);

    public Specification updateSpecification(Long id, Specification data);

    public SpecificationList findAllSpecifications();
}
