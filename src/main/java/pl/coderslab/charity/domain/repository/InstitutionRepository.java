package pl.coderslab.charity.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.domain.model.Institution;

public interface InstitutionRepository extends CrudRepository<Institution, Long> {
}
