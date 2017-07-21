package nutricalc.core.services;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.services.util.SpecificationList;

import java.util.List;

public interface SpecificationService {

    Specification add(Specification data);

    SpecificationList findAllByTitle(String specificationTitle);

    Specification findById(Long id);

    Specification update(Long id, Specification data);

    SpecificationList findAll();
}
