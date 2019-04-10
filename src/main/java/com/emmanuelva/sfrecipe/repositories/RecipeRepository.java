package com.emmanuelva.sfrecipe.repositories;

import com.emmanuelva.sfrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
