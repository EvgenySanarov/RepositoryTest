package com.training.es.hw5.task1;

public class CreditCard extends Card {
    public CreditCard(double balance, String cardholderName) {
        this.balance = balance;
        this.cardholderName = cardholderName;
    }

    @Override
    public void reducedBalance(double money) {
        if (money > 0) {
            balance -= money;
            System.out.println(balance);
        }
    }
}