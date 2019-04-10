package com.emmanuelva.sfrecipe.repositories;

import com.emmanuelva.sfrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
