/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

/**
 *
 * @author marius
 */
public class Employee extends Client {
    private String jobDescription;
    private double salary;

    public Employee(String jobDescription, double salary, String Name, String CI, String CNP, String CardNumber, int ID, Card creditCard) {
        super(Name, CI, CNP, CardNumber, ID, creditCard);
        this.jobDescription = jobDescription;
        this.salary = salary;
    }

    public Employee(String jobDescription, double salary) {
        this.jobDescription = jobDescription;
        this.salary = salary;
    }

    public Employee(String Name, String CI, String CNP, String CardNumber, int ID, Card creditCard) {
        super(Name, CI, CNP, CardNumber, ID, creditCard);
        this.jobDescription = null;
        this.salary = 0;
    }

    public Employee() {
        super();
        this.jobDescription = null;
        this.salary = 0;
    }
    
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    
}
