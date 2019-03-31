/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

import java.time.Duration;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marius
 */
public class Food extends Product {
    private List<String> ingredients;
    private Duration preparation;

    public Food(List<String> ingredients, Duration preparation, String name, Supplier supplier, double price, int stock, Date expiration) {
        super(name, supplier, price, stock, expiration);
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public Food(List<String> ingredients, Duration preparation) {
        super();
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public Food(String name, Supplier supplier, double price, int stock, Date expiration) {
        super(name, supplier, price, stock, expiration);
        this.ingredients = null;
        this.preparation = null;
    }

    public Food() {
        super();
        this.ingredients = null;
        this.preparation = null;
    }
    
    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Duration getPreparation() {
        return preparation;
    }

    public void setPreparation(Duration preparation) {
        this.preparation = preparation;
    }
}
