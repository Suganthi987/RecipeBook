package com.example.recipeBook.Data;

import com.example.recipeBook.Model.Ingredients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredients, Integer> {
}
