package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void subTwoLongPositive() {
        Assert.assertEquals(10L, calculator.sub(15L, 5L));
    }

    @Test
    public void subLongPositiveAndNegative() {
        Assert.assertEquals(10L, calculator.sub(5L, -5L));
    }

    @Test
    public void subTwoLongNegative() {
        Assert.assertEquals(-10L, calculator.sub(-15L, -5L));
    }

    @Test
    public void subPositiveLongAndZero() {
        Assert.assertEquals(10L, calculator.sub(10L, 0));
    }

    @Test
    public void subTwoDoublePositive() {
        Assert.assertEquals(10.0, calculator.sub(15.1, 5.1));
    }

    @Test
    public void subTwoDoubleNegative() {
        Assert.assertEquals(-10.0, calculator.sub(-15.1, -5.1));
    }

    @Test
    public void subPositiveDoubleAndZero() {
        Assert.assertEquals(10.2, calculator.sub(10.2, 0));
    }
}
