package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivisionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void divideTwoLongPositive() {
        Assert.assertEquals(calculator.div(25L, 5L), 5L, "dividend: 25, divisor: 5");
    }

    @Test
    public void divideLongPositiveAndNegative() {
        Assert.assertEquals(calculator.div(25L, -5L), -5L, "dividend: 25, divisor: -5");
    }

    @Test
    public void divideTwoLongNegative() {
        Assert.assertEquals(calculator.div(-25L, -5L), 5L, "dividend: -25, divisor: -5");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void dividePositiveLongAndZeroExpectedException() {
        Assert.assertEquals(calculator.div(10L, 0), 0);
    }

    @Test
    public void divideTwoDoublePositive() {
        Assert.assertEquals(calculator.div(25.1, 5.1), 5.0, "dividend: 25.1, divisor: 5.1");
    }

    @Test
    public void divideTwoDoubleNegative() {
        Assert.assertEquals(calculator.div(-25.1, -5.1), 5.0, "dividend: -25.1, divisor: -5.1");
    }

    @Test
    public void dividePositiveDoubleAndZeroExpectedPOSITIVE_INFINITY() {
        Assert.assertEquals(calculator.div(10.2, 0), Double.POSITIVE_INFINITY);
    }
}
