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
        Assert.assertEquals(calculator.div(25L, 5L), 5L, "dividend: 25, divisor: 5");
    }

    @Test
    public void divLongPositiveAndNegative() {
        Assert.assertEquals(calculator.div(25L, -5L), -5L, "dividend: 25, divisor: -5");
    }

    @Test
    public void divTwoLongNegative() {
        Assert.assertEquals(calculator.div(-25L, -5L), 5L, "dividend: -25, divisor: -5");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divPositiveLongAndZeroExpectedException() {
        Assert.assertEquals(calculator.div(10L, 0), 0);
    }

    @Test
    public void divTwoDoublePositive() {
        Assert.assertEquals(calculator.div(25.1, 5.1), 5.0, "dividend: 25.1, divisor: 5.1");
    }

    @Test
    public void divTwoDoubleNegative() {
        Assert.assertEquals(calculator.div(-25.1, -5.1), 5.0, "dividend: -25.1, divisor: -5.1");
    }

    @Test
    public void divPositiveDoubleAndZeroExpectedPOSITIVE_INFINITY() {
        Assert.assertEquals(calculator.div(10.2, 0), Double.POSITIVE_INFINITY);
    }
}
