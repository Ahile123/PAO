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
public class ServiceClass {
    private List<Client> clients;
    private List<Transaction> transactions;
    private List<Employee> employees;
    private List<Product> products;
    private List<Tax> taxes;
    private List<Supplier> suppliers;
    private List<Food> foods;
    private List<Card> cards;
    
    public void addClient(Client client)
    {
        this.clients.add(client);
    }
    public void addTransaction(Transaction transaction)
    {
        this.transactions.add(transaction);
    }
    public void addEmployee(Employee employee)
    {
        this.employees.add(employee);
    }
    public void addProduct(Product product)
    {
        this.products.add(product);
    }
    public void addTax(Tax tax)
    {
        this.taxes.add(tax);
    }
    public void addSupplier(Supplier supplier)
    {
        this.suppliers.add(supplier);
    }
    public void addFood(Food food)
    {
        this.foods.add(food);
    }
    public void addCard(Card card)
    {
        this.cards.add(card);
    }
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
}
