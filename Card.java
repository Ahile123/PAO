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
public class Card {
    private String holderName;
    private int cardNumber;
    private int accountBalance;
    private double spendingLimit;
    private int accountLevel; 

    public Card(String holderName, int cardNumber, int accountBalance, double spendingLimit, int accountLevel) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.spendingLimit = spendingLimit;
        this.accountLevel = accountLevel;
    }
    public Card()
    {
        this.holderName = null;
        this.cardNumber = 0;
        this.accountBalance = 0;
        this.spendingLimit = 0;
        this.accountLevel = 0;
    }
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(double spendingLimit) {
        this.spendingLimit = spendingLimit;
    }

    public int getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(int accountLevel) {
        this.accountLevel = accountLevel;
    }

}
