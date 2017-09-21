package nutricalc.core.services;

import nutricalc.core.domain.Specification;
import nutricalc.core.services.util.SpecificationList;

public interface SpecificationService {

    Specification add(Specification data);

    SpecificationList findAllByTitle(String specificationTitle);

    Specification findById(Long id);

    Specification update(Long id, Specification data);

    SpecificationList findAll();
}
