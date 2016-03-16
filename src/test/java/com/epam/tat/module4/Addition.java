package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Addition {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test(groups = "smoke")
    public void addTwoLongPositive() {
        assertEquals(calculator.sum(5L, 5L), 10L, "Sum of 5 and 5");
    }

    @Test
    public void addLongPositiveAndNegative() {
        assertEquals(calculator.sum(15L, -5L), 10L, "Sum of 15 and -5");
    }

    @Test
    public void addTwoLongNegative() {
        assertEquals(calculator.sum(-5L, -5L), -10L, "Sum of -5 and -5");
    }

    @Test
    public void addPositiveLongAndZero() {
        assertEquals(calculator.sum(10L, 0), 10L, "Sum of 10 and 0");
    }

    @Test
    public void addTwoDoublePositive() {
        assertEquals(calculator.sum(5.1, 5.1), 10.2, "Sum of 5.1 and 5.1");
    }

    @Test
    public void addTwoDoubleNegative() {
        assertEquals(calculator.sum(-5.1, -5.1), -10.2, "Sum of -5.1 and -5.1");
    }

    @Test
    public void addPositiveDoubleAndZero() {
        assertEquals(calculator.sum(10.2, 0), 10.2, "Sum of 10.2 and 0");
    }
}
