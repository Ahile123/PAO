/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

import java.util.Date;
import proiectpao.Constants.TransType;

/**
 *
 * @author marius
 */
public class Transaction {
    private Date data;
    private TransType type;
    private String description, customer;
    private Double value, discount;
    public Transaction()
    {
        this.data = null;
        this.description = this.customer = null;
        this.value = this.discount = 0.0; 
        this.type = null;
    }

    public Transaction(Date data, TransType type, String description, String customer, Double value, Double discount) {
        this.data = data;
        this.type = type;
        this.description = description;
        this.customer = customer;
        this.value = value;
        this.discount = discount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Transaction{" + "Data=" + data + ", Type=" + type + ", Description=" + description + ", Customer=" + customer + ", Value=" + value + ", Discount=" + discount + '}';
    }
    public Date getData() {
        return data;
    }

    public void setData(Date Data) {
        this.data = Data;
    }

    public TransType getType() {
        return type;
    }

    public void setType(TransType Type) {
        this.type = Type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String Customer) {
        this.customer = Customer;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double Value) {
        this.value = Value;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double Discount) {
        this.discount = Discount;
    }
    
}
