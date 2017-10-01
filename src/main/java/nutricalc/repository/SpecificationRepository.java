package nutricalc.repository;

import nutricalc.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpecificationRepository extends PagingAndSortingRepository<Specification, Long> {
}
