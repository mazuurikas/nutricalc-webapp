package nutricalc.core.repositories;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.services.util.SpecificationList;

import java.util.List;

public interface SpecificationRepo {
    public Specification addSpecification(Specification data);
    public List<Specification> searchSpecificationsByTitle(String specificationTitle);
    public Specification findSpecification(Long id);
    public Specification updateSpecification(Long id, Specification data);
    public List<Specification> findAllSpecifications();
}
