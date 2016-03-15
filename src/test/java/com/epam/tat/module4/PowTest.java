package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PowTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void basePositiveExponentPositive() {
        Assert.assertEquals(calculator.pow(2, 2), 4, "base: 2, exponent: 2");
    }

    @Test
    public void baseNegativeExponentPositive() {
        Assert.assertEquals(calculator.pow(-2, 2), 4, "base: -2, exponent: 2");
    }

    @Test
    public void basePositiveExponentNegative() {
        Assert.assertEquals(calculator.sum(2, -2), 0.25, "base: 2, exponent: -2");
    }

@Test
    public void baseNegativeExponentNegative() {
        Assert.assertEquals(calculator.sum(-2, -2), 0.25, "base: -2, exponent: -2");
    }

    @Test
    public void baseNegativeExponentOne() {
        Assert.assertEquals(calculator.pow(-2, 1), -2, "base: -2");
    }

    @Test
    public void basePositiveExponentOne() {
        Assert.assertEquals(calculator.pow(2, 1), 2, "base: 2");
    }

    @Test
    public void basePositiveExponentZero() {
        Assert.assertEquals(calculator.pow(2, 0), 1, "base: 2");
    }

    @Test
    public void baseNegativeExponentZero() {
        Assert.assertEquals(calculator.pow(-2, 0), 1, "base: -2");
    }
}
