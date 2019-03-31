/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

import java.util.List;

/**
 *
 * @author marius
 */
public class Supplier {
    private String name;
    List<String> products;

    public Supplier() {
        this.name = null;
        this.products = null;
    }

    public Supplier(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
