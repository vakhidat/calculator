package com.epam.tat.module4.arithmetic_operations;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivisionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test(groups = "smoke")
    public void divideTwoLongPositive() {
        assertEquals(calculator.div(25L, 5L), 5L, "dividend: 25, divisor: 5");
    }

    @Test
    public void divideLongPositiveAndNegative() {
        assertEquals(calculator.div(25L, -5L), -5L, "dividend: 25, divisor: -5");
    }

    @Test
    public void divideTwoLongNegative() {
        assertEquals(calculator.div(-25L, -5L), 5L, "dividend: -25, divisor: -5");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void dividePositiveLongAndZeroExpectedException() {
        assertEquals(calculator.div(10L, 0), 0);
    }

    @Test(groups = "smoke")
    public void divideTwoDoublePositive() {
        assertEquals(calculator.div(25.1, 5.1), 5.0, "dividend: 25.1, divisor: 5.1");
    }

    @Test
    public void divideTwoDoubleNegative() {
        assertEquals(calculator.div(-25.1, -5.1), 5.0, "dividend: -25.1, divisor: -5.1");
    }

    @Test
    public void dividePositiveDoubleAndZeroExpectedPOSITIVE_INFINITY() {
        assertEquals(calculator.div(10.2, 0), Double.POSITIVE_INFINITY);
    }
}
