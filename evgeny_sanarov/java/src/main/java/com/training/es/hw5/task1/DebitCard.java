package com.training.es.hw5.task1;

public class DebitCard extends Card {

    public DebitCard(double balance, String cardholderName) {
        this.balance = balance;
        this.cardholderName = cardholderName;
    }

    @Override
    public void reducedBalance(double money) {
        if (money > 0) {
            if (balance >= money) {
                balance -= money;
                System.out.println(balance);
            } else
                System.out.println("Not enough money");
        }
    }
}