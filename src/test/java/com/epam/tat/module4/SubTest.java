package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void subTwoLongPositive() {
        Assert.assertEquals(calculator.sub(15L, 5L), 10L, "Sub of 15 and 5");
    }

    @Test
    public void subLongPositiveAndNegative() {
        Assert.assertEquals(calculator.sub(5L, -5L), 10L, "Sub of 15 and 5");
    }

    @Test
    public void subTwoLongNegative() {
        Assert.assertEquals(calculator.sub(-15L, -5L), -10L, "Sub of 15 and 5");
    }

    @Test
    public void subPositiveLongAndZero() {
        Assert.assertEquals(calculator.sub(10L, 0), 10L, "Sub of 10 and 0");
    }

    @Test
    public void subTwoDoublePositive() {
        Assert.assertEquals(calculator.sub(15.1, 5.1), 10.0, "Sub of 15.1 and 5.1");
    }

    @Test
    public void subTwoDoubleNegative() {
        Assert.assertEquals(calculator.sub(-15.1, -5.1), -10.0, "Sub of -15.1 and -5.1");
    }

    @Test
    public void subPositiveDoubleAndZero() {
        Assert.assertEquals(calculator.sub(10.2, 0), 10.2, "Sub of 10.2 and 0");
    }
}
