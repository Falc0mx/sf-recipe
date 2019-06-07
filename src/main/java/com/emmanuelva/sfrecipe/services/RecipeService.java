package com.emmanuelva.sfrecipe.services;

import com.emmanuelva.sfrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
