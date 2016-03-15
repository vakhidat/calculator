package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void multiplyTwoLongPositive() {
        Assert.assertEquals(calculator.mult(5L, 5L), 25L, "factors: 5, 5");
    }

    @Test
    public void multiplyLongPositiveAndNegative() {
        Assert.assertEquals(calculator.mult(5L, -5L), -25L, "factors: 5, -5");
    }

    @Test
    public void multiplyTwoLongNegative() {
        Assert.assertEquals(calculator.mult(-5L, -5L), 25L, "factors: -5, -5");
    }

    @Test
    public void multiplyPositiveLongAndZero() {
        Assert.assertEquals(calculator.mult(10L, 0), 0, "factor: 10");
    }

    @Test
    public void multiplyTwoDoublePositive() {
        Assert.assertEquals(calculator.mult(5.1, 5.1), 25.0, "factors: 5.1, 5.1");
    }

    @Test
    public void multiplyTwoDoubleNegative() {
        Assert.assertEquals(calculator.mult(-5.1, -5.1), 25.0, "factors: -5.1, -5.1");
    }

    @Test
    public void multiplyPositiveDoubleAndZero() {
        Assert.assertEquals(calculator.mult(10.2, 0), 0, "factor: 10.2");
    }
}
