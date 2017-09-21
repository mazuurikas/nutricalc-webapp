package nutricalc.core.services.impl;

import nutricalc.core.domain.Specification;
import nutricalc.core.repositories.SpecificationRepository;
import nutricalc.core.services.SpecificationService;
import nutricalc.core.services.util.SpecificationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

    private final SpecificationRepository specificationRepository;

    @Autowired
    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public Specification add(Specification data) {
        return specificationRepository.add(data);
    }

    @Override
    public SpecificationList findAllByTitle(String specificationTitle) {
        return new SpecificationList(specificationRepository.findAllByTitle(specificationTitle));
    }

    @Override
    public Specification findById(Long id) {
        return specificationRepository.findById(id);
    }

    @Override
    public Specification update(Long id, Specification data) {
        return specificationRepository.update(id, data);
    }

    @Override
    public SpecificationList findAll() {
        return new SpecificationList(specificationRepository.findAll());
    }
}
