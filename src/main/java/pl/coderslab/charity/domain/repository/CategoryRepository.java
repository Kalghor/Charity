package pl.coderslab.charity.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.domain.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
