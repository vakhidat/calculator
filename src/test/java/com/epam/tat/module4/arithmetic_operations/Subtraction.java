package com.epam.tat.module4.arithmetic_operations;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Subtraction {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void subtractTwoLongPositive() {
        assertEquals(calculator.sub(15L, 5L), 10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractLongPositiveAndNegative() {
        assertEquals(calculator.sub(5L, -5L), 10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractTwoLongNegative() {
        assertEquals(calculator.sub(-15L, -5L), -10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractPositiveLongAndZero() {
        assertEquals(calculator.sub(10L, 0), 10L, "Subtraction of 10 and 0");
    }

    @Test
    public void subtractTwoDoublePositive() {
        assertEquals(calculator.sub(15.1, 5.1), 10.0, "Subtraction of 15.1 and 5.1");
    }

    @Test
    public void subtractTwoDoubleNegative() {
        assertEquals(calculator.sub(-15.1, -5.1), -10.0, "Subtraction of -15.1 and -5.1");
    }

    @Test
    public void subtractPositiveDoubleAndZero() {
        assertEquals(calculator.sub(10.2, 0), 10.2, "Subtraction of 10.2 and 0");
    }
}
