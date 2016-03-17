package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsPositiveTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void isPositiveTrue() {
        assertTrue(calculator.isPositive(7));
    }

    @Test
    public void isPositiveFalse() {
        assertFalse(calculator.isPositive(-7));
    }
}
