package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RacipeRepository extends CrudRepository<Recipe, Long> {


}
