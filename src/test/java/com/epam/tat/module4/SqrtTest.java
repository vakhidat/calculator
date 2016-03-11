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
        Assert.assertEquals(2, calculator.sqrt(4));
    }

    @Test
    public void sqrtNegative() {
        Assert.assertEquals(Double.NaN, calculator.sqrt(-4));
    }

    @Test
    public void sqrtZero() {
        Assert.assertEquals(0, calculator.sqrt(0));
    }

    @Test
    public void sqrtDecimal() {
        Assert.assertEquals(1.0954451150103321, calculator.sqrt(1.2));
    }

    @Test
    public void sqrtOne() {
        Assert.assertEquals(1, calculator.sqrt(1));
    }
}
