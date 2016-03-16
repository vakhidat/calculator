package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Multiplication {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void multiplyTwoLongPositive() {
        assertEquals(calculator.mult(5L, 5L), 25L, "factors: 5, 5");
    }

    @Test
    public void multiplyLongPositiveAndNegative() {
        assertEquals(calculator.mult(5L, -5L), -25L, "factors: 5, -5");
    }

    @Test
    public void multiplyTwoLongNegative() {
        assertEquals(calculator.mult(-5L, -5L), 25L, "factors: -5, -5");
    }

    @Test
    public void multiplyPositiveLongAndZero() {
        assertEquals(calculator.mult(10L, 0), 0, "factor: 10");
    }

    @Test
    public void multiplyTwoDoublePositive() {
        assertEquals(calculator.mult(5.1, 5.1), 25.0, "factors: 5.1, 5.1");
    }

    @Test
    public void multiplyTwoDoubleNegative() {
        assertEquals(calculator.mult(-5.1, -5.1), 25.0, "factors: -5.1, -5.1");
    }

    @Test
    public void multiplyPositiveDoubleAndZero() {
        assertEquals(calculator.mult(10.2, 0), 0, "factor: 10.2");
    }
}