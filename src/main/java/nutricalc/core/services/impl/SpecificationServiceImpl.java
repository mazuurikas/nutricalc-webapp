package nutricalc.core.services.impl;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.repositories.SpecificationRepo;
import nutricalc.core.services.SpecificationService;
import nutricalc.core.services.util.SpecificationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpecificationServiceImpl implements SpecificationService{

    @Autowired
    private SpecificationRepo specificationRepo;


    @Override
    public Specification addSpecification(Specification data) {
        return specificationRepo.addSpecification(data);
    }

    @Override
    public SpecificationList searchSpecificationsByTitle(String specificationTitle) {
        return new SpecificationList(specificationRepo.searchSpecificationsByTitle(specificationTitle));
    }

    @Override
    public Specification getSpecification(Long id) {
        return specificationRepo.findSpecification(id);
    }

    @Override
    public Specification updateSpecification(Long id, Specification data) {
        return specificationRepo.updateSpecification(id, data);
    }

    @Override
    public SpecificationList findAllSpecifications() {
        return new SpecificationList(specificationRepo.findAllSpecifications());
    }
}
