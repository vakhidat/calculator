package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsNegativeTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void isNegativeTrue() {
        Assert.assertTrue(calculator.isNegative(-7));
    }

    @Test
    public void isNegativeFalse() {
        Assert.assertFalse(calculator.isNegative(7));
    }
}
