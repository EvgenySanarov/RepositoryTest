package com.training.es.hw5.task1;

public abstract class Card {
    protected double balance;
    protected String cardholderName;

    public void increasedBalance(double money) {
        if (money > 0) {
            balance += money;
            System.out.println(balance);
        }
    }

    public abstract void reducedBalance(double money);

    public double getBalance() {
        return balance;
    }

}