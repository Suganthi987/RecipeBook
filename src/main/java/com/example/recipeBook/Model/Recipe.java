package com.example.recipeBook.Model;

import jakarta.persistence.Entity;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Recipe extends AbstractEntity {
@NotNull
String recipe_name;

@NotNull
String description;

    public Recipe() {
    }

    public Recipe(String recipe_name, String description) {
        this.recipe_name = recipe_name;
        this.description = description;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
