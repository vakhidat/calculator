package com.epam.tat.module4.positive_negative;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsPositiveTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public static void disposeCalculator() {
        calculator = null;
    }

    @Test(priority = 0)
    public void isPositiveTrue() {
        assertTrue(calculator.isPositive(7));
    }

    @Test(priority = 1)
    public void isPositiveFalse() {
        assertFalse(calculator.isPositive(-7));
    }
}
