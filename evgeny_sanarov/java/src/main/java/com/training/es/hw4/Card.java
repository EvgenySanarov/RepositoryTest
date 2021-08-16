package com.training.es.hw4;

public class Card {
    private String cardholderName;
    private double balance;

    Card(String cardholderName, double balance) {
        this.cardholderName = cardholderName;
        this.balance = balance;
    }

    Card(String cardholderName) {
        this.cardholderName = cardholderName;
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public double printBalance() {
        System.out.println(balance);
        return balance;
    }

    public void increasedBalance(double money) {
        if (money > 0) {
            balance = balance + money;
        }

    }

    public void reducedBalance(double money) {
        if (money > 0) {
            balance = balance - money;
        }
    }

    public double printConvertedBalance(double rate) {
        System.out.println(balance * rate);
        return balance * rate;
    }
}