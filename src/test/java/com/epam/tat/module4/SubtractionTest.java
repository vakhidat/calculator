package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubtractionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void subtractTwoLongPositive() {
        Assert.assertEquals(calculator.sub(15L, 5L), 10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractLongPositiveAndNegative() {
        Assert.assertEquals(calculator.sub(5L, -5L), 10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractTwoLongNegative() {
        Assert.assertEquals(calculator.sub(-15L, -5L), -10L, "Subtraction of 15 and 5");
    }

    @Test
    public void subtractPositiveLongAndZero() {
        Assert.assertEquals(calculator.sub(10L, 0), 10L, "Subtraction of 10 and 0");
    }

    @Test
    public void subtractTwoDoublePositive() {
        Assert.assertEquals(calculator.sub(15.1, 5.1), 10.0, "Subtraction of 15.1 and 5.1");
    }

    @Test
    public void subtractTwoDoubleNegative() {
        Assert.assertEquals(calculator.sub(-15.1, -5.1), -10.0, "Subtraction of -15.1 and -5.1");
    }

    @Test
    public void subtractPositiveDoubleAndZero() {
        Assert.assertEquals(calculator.sub(10.2, 0), 10.2, "Subtraction of 10.2 and 0");
    }
}
