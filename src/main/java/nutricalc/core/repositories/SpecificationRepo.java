package nutricalc.core.repositories;

import nutricalc.core.models.entities.Specification;

import java.util.List;

public interface SpecificationRepo {
    Specification findById(Long id);

    Specification update(Long id, Specification data);

    Specification add(Specification data);

    List<Specification> findAll();

    List<Specification> findAllByTitle(String specificationTitle);
}
