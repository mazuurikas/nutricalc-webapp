package nutricalc.core.repository;

import nutricalc.core.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpecificationRepository extends PagingAndSortingRepository<Specification, Long> {
}
