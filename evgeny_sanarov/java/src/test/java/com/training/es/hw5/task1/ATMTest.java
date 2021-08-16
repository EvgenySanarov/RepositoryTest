package com.training.es.hw5.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
    public static double START_BALANCE = 500;
    Card debitCard;
    Card creditCard;
    ATM atm = new ATM();

    @Before
    public void setupCard() {
        debitCard = new DebitCard(START_BALANCE, "Oleg");
        creditCard = new CreditCard(START_BALANCE, "Dmitriy");
    }

    @Test
    public void testDebitReducedBalance() {
        atm.getCash(debitCard, 200);
        Assert.assertEquals(START_BALANCE - 200, debitCard.getBalance(), 0);
    }

    @Test
    public void testDebitReducedBalanceNegative() {
        atm.getCash(creditCard, -600);
        Assert.assertEquals(START_BALANCE, creditCard.getBalance(), 0);
    }

    @Test
    public void testDebitIncreasedBalance() {
        atm.putCash(debitCard, 300);
        Assert.assertEquals(START_BALANCE + 300, debitCard.getBalance(), 0);
    }

    @Test
    public void testCreditReducedBalance() {
        atm.getCash(creditCard, 600);
        Assert.assertEquals(START_BALANCE - 600, creditCard.getBalance(), 0);
    }

    @Test
    public void testCreditReducedBalanceNegative() {
        atm.getCash(creditCard, -600);
        Assert.assertEquals(START_BALANCE, creditCard.getBalance(), 0);
    }

    @Test
    public void testCreditIncreasedBalance() {
        atm.putCash(creditCard, 255);
        Assert.assertEquals(START_BALANCE + 255, creditCard.getBalance(), 0);
    }

    @Test
    public void testCreditIncreasedBalanceNegative() {
        atm.putCash(creditCard, -255);
        Assert.assertEquals(START_BALANCE, creditCard.getBalance(), 0);
    }
}