/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

import java.util.Date;

/**
 *
 * @author marius
 */
public class Product {
    private String name;
    private Supplier supplier;
    private double price;
    private int stock;
    private Date expiration;

    public Product(String name, Supplier supplier, double price, int stock, Date expiration) {
        this.name = name;
        this.supplier = supplier;
        this.price = price;
        this.stock = stock;
        this.expiration = expiration;
    }
    public Product()
    {
        this.name = null;
        this.supplier = null;
        this.price = 0;
        this.stock = 0;
        this.expiration = null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    
}
