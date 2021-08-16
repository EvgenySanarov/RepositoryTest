package com.training.es.hw5.task1;

public class ATM {
    public void putCash(Card card, double cash) {
        card.increasedBalance(cash);
    }

    public void getCash(Card card, double cash) {
        card.reducedBalance(cash);
    }
}