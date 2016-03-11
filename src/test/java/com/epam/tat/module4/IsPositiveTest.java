package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsPositiveTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void isPositiveTrue() {
        Assert.assertTrue(calculator.isPositive(7));
    }

    @Test
    public void isPositiveFalse() {
        Assert.assertFalse(calculator.isPositive(-7));
    }
}
