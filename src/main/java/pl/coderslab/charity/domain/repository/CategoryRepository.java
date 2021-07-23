package pl.coderslab.charity.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
