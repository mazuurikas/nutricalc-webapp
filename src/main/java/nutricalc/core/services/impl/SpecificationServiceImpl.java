package nutricalc.core.services.impl;

import nutricalc.core.models.entities.Specification;
import nutricalc.core.repositories.SpecificationRepo;
import nutricalc.core.services.SpecificationService;
import nutricalc.core.services.util.SpecificationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

    private final SpecificationRepo specificationRepo;

    @Autowired
    public SpecificationServiceImpl(SpecificationRepo specificationRepo) {
        this.specificationRepo = specificationRepo;
    }

    @Override
    public Specification add(Specification data) {
        return specificationRepo.add(data);
    }

    @Override
    public SpecificationList findAllByTitle(String specificationTitle) {
        return new SpecificationList(specificationRepo.findAllByTitle(specificationTitle));
    }

    @Override
    public Specification findById(Long id) {
        return specificationRepo.findById(id);
    }

    @Override
    public Specification update(Long id, Specification data) {
        return specificationRepo.update(id, data);
    }

    @Override
    public SpecificationList findAll() {
        return new SpecificationList(specificationRepo.findAll());
    }
}
