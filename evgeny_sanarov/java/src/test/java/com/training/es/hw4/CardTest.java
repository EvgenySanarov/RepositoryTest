package com.training.es.hw4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    public static double START_BALANCE = 465.78;
    Card card;

    @Before
    public void setupCard() {
        card = new Card("name", START_BALANCE);
    }

    @Test
    public void testPrintBalance() {
        Assert.assertEquals(START_BALANCE, card.getBalance(), 0);
    }

    @Test
    public void testIncreasedBalance() {
        card.increasedBalance(30);
        Assert.assertEquals(START_BALANCE + 30, card.getBalance(), 0);
    }

    @Test
    public void testIncreasedBalanceNegative() {
        card.increasedBalance(-30);
        Assert.assertEquals(START_BALANCE, card.getBalance(), 0);
    }

    @Test
    public void testReducedBalance() {
        card.reducedBalance(25.5);
        Assert.assertEquals(START_BALANCE - 25.5, card.getBalance(), 0);

    }

    @Test
    public void testReducedBalanceNegative() {
        card.reducedBalance(-25.5);
        Assert.assertEquals(START_BALANCE, card.getBalance(), 0);

    }

    @Test
    public void printConvertedBalance() {
        Assert.assertEquals(START_BALANCE * 1.5, card.printConvertedBalance(1.5), 0);
    }
}