package com.example.recipeBook.Model;

import jakarta.persistence.Entity;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Ingredients extends AbstractEntity {

    @NotNull
    String ingredient_name;

    @NotNull
    String amount;

    public Ingredients() {
    }

    public Ingredients(String ingredient_name, String amount) {
        this.ingredient_name = ingredient_name;
        this.amount = amount;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
