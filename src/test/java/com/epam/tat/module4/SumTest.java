package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumTwoLongPositive() {
        Assert.assertEquals(calculator.sum(5L, 5L), 10L, "Sum of 5 and 5");
    }

    @Test
    public void sumLongPositiveAndNegative() {
        Assert.assertEquals(calculator.sum(15L, -5L), 10L, "Sum of 15 and -5");
    }

    @Test
    public void sumTwoLongNegative() {
        Assert.assertEquals(calculator.sum(-5L, -5L), -10L, "Sum of -5 and -5");
    }

    @Test
    public void sumPositiveLongAndZero() {
        Assert.assertEquals(calculator.sum(10L, 0), 10L, "Sum of 10 and 0");
    }

    @Test
    public void sumTwoDoublePositive() {
        Assert.assertEquals(calculator.sum(5.1, 5.1), 10.2, "Sum of 5.1 and 5.1");
    }

    @Test
    public void sumTwoDoubleNegative() {
        Assert.assertEquals(calculator.sum(-5.1, -5.1), -10.2, "Sum of -5.1 and -5.1");
    }

    @Test
    public void sumPositiveDoubleAndZero() {
        Assert.assertEquals(calculator.sum(10.2, 0), 10.2, "Sum of 10.2 and 0");
    }
}
