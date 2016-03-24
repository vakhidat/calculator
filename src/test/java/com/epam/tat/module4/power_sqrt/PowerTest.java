package com.epam.tat.module4.power_sqrt;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowerTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public static void disposeCalculator() {
        calculator = null;
    }

    @Test
    public void basePositiveExponentPositive() {
        assertEquals(calculator.pow(2, 2), 4.0, "base: 2, exponent: 2");
    }

    @Test
    public void baseNegativeExponentPositive() {
        assertEquals(calculator.pow(-2, 2), 4.0, "base: -2, exponent: 2");
    }

    @Test
    public void basePositiveExponentNegative() {
        assertEquals(calculator.pow(2, -2), 0.25, "base: 2, exponent: -2");
    }

@Test
    public void baseNegativeExponentNegative() {
        assertEquals(calculator.pow(-2, -2), 0.25, "base: -2, exponent: -2");
    }

    @Test
    public void baseNegativeExponentOne() {
        assertEquals(calculator.pow(-2, 1), -2.0, "base: -2");
    }

    @Test
    public void basePositiveExponentOne() {
        assertEquals(calculator.pow(2, 1), 2.0, "base: 2");
    }

    @Test
    public void basePositiveExponentZero() {
        assertEquals(calculator.pow(2, 0), 1.0, "base: 2");
    }

    @Test
    public void baseNegativeExponentZero() {
        assertEquals(calculator.pow(-2, 0), 1.0, "base: -2");
    }
}
