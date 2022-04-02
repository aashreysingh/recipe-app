package com.bizarreDomain.recipeapp.repositories;

import com.bizarreDomain.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
