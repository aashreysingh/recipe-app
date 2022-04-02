package com.bizarreDomain.recipeapp.repositories;

import com.bizarreDomain.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
