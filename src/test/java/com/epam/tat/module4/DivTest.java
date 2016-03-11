package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void divTwoLongPositive() {
        Assert.assertEquals(5L, calculator.div(25L, 5L));
    }

    @Test
    public void divLongPositiveAndNegative() {
        Assert.assertEquals(-5L, calculator.div(25L, -5L));
    }

    @Test
    public void divTwoLongNegative() {
        Assert.assertEquals(5L, calculator.div(-25L, -5L));
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divPositiveLongAndZero() {
        Assert.assertEquals(0, calculator.div(10L, 0));
    }

    @Test
    public void divTwoDoublePositive() {
        Assert.assertEquals(5.0, calculator.div(25.1, 5.1));
    }

    @Test
    public void divTwoDoubleNegative() {
        Assert.assertEquals(5.0, calculator.div(-25.1, -5.1));
    }

    @Test
    public void divPositiveDoubleAndZero() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculator.div(10.2, 0));
    }
}
