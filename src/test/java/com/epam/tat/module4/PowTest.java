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
    public void powPositivePowerPositive() {
        Assert.assertEquals(4, calculator.pow(2, 2));
    }

    @Test
    public void powNegativePowerPositive() {
        Assert.assertEquals(4L, calculator.sum(-2, 2));
    }

    @Test
    public void powPositivePowerNegative() {
        Assert.assertEquals(0.25, calculator.sum(2, -2));
    }

    @Test
    public void powNegativePowerOne() {
        Assert.assertEquals(-2, calculator.pow(-2, 1));
    }

    @Test
    public void powPositivePowerOne() {
        Assert.assertEquals(2, calculator.pow(2, 1));
    }

    @Test
    public void powPositivePowerZero() {
        Assert.assertEquals(1, calculator.pow(2, 0));
    }

    @Test
    public void powNegativePowerZero() {
        Assert.assertEquals(1, calculator.pow(-2, 0));
    }
}
