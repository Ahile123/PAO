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
public class Client {
    private String Name,CI,CNP,CardNumber;
    private int ID;
    private Card creditCard;

    public Client(String Name, String CI, String CNP, String CardNumber, int ID, Card creditCard) {
        this.Name = Name;
        this.CI = CI;
        this.CNP = CNP;
        this.CardNumber = CardNumber;
        this.ID = ID;
        this.creditCard = creditCard;
    }
    public Client()
    {
        this.Name = null;
        this.CI = null;
        this.CNP = null;
        this.CardNumber = null;
        this.ID = 0;
        this.creditCard = null;
    }
    public Card getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
