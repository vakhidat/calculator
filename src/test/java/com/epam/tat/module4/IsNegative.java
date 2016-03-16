package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsNegative {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void isNegativeTrue() {
        assertTrue(calculator.isNegative(-7));
    }

    @Test
    public void isNegativeFalse() {
        assertFalse(calculator.isNegative(7));
    }
}
