package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void multTwoLongPositive() {
        Assert.assertEquals(25L, calculator.mult(5L, 5L));
    }

    @Test
    public void multLongPositiveAndNegative() {
        Assert.assertEquals(-25L, calculator.mult(5L, -5L));
    }

    @Test
    public void multTwoLongNegative() {
        Assert.assertEquals(25L, calculator.mult(-5L, -5L));
    }

    @Test
    public void multPositiveLongAndZero() {
        Assert.assertEquals(0, calculator.mult(10L, 0));
    }

    @Test
    public void multTwoDoublePositive() {
        Assert.assertEquals(25.0, calculator.mult(5.1, 5.1));
    }

    @Test
    public void multTwoDoubleNegative() {
        Assert.assertEquals(25.0, calculator.mult(-5.1, -5.1));
    }

    @Test
    public void multPositiveDoubleAndZero() {
        Assert.assertEquals(0, calculator.mult(10.2, 0));
    }
}
