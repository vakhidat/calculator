package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SqrtTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sqrtPositive() {
        Assert.assertEquals(calculator.sqrt(4), 2, "sqrt of 4");
    }

    @Test
    public void sqrtNegativeExpectNaN() {
        Assert.assertEquals(calculator.sqrt(-4), Double.NaN);
    }

    @Test
    public void sqrtZeroExpectZero() {
        Assert.assertEquals(calculator.sqrt(0), 0);
    }

    @Test
    public void sqrtDecimal() {
        Assert.assertEquals(calculator.sqrt(1.2), 1.0954451150103321, "sqrt of 1.2");
    }

    @Test
    public void sqrtOneExpectOne() {
        Assert.assertEquals(calculator.sqrt(1), 1);
    }
}
