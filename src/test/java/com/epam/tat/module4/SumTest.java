package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumTwoLongPositive() {
        Assert.assertEquals(10L, calculator.sum(5L, 5L));
    }

    @Test
    public void sumLongPositiveAndNegative() {
        Assert.assertEquals(10L, calculator.sum(15L, -5L));
    }

    @Test
    public void sumTwoLongNegative() {
        Assert.assertEquals(-10L, calculator.sum(-5L, -5L));
    }

    @Test
    public void sumPositiveLongAndZero() {
        Assert.assertEquals(10L, calculator.sum(10L, 0));
    }

    @Test
    public void sumTwoDoublePositive() {
        Assert.assertEquals(10.2, calculator.sum(5.1, 5.1));
    }

    @Test
    public void sumTwoDoubleNegative() {
        Assert.assertEquals(-10.2, calculator.sum(-5.1, -5.1));
    }

    @Test
    public void sumPositiveDoubleAndZero() {
        Assert.assertEquals(10.2, calculator.sum(10.2, 0));
    }
}
