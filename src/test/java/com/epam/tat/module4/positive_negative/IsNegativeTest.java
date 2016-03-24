package com.epam.tat.module4.positive_negative;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsNegativeTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test(priority = 0)
    public void isNegativeTrue() {
        assertTrue(calculator.isNegative(-7));
    }

    @Test(priority = 1)
    public void isNegativeFalse() {
        assertFalse(calculator.isNegative(7));
    }
}
