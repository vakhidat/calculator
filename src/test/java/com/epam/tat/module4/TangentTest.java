package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

public class TangentTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void tangent0() {
        Assert.assertEquals(calculator.tg(0), 0);
    }

    @Test
    public void tangent45() {
        Assert.assertEquals(calculator.tg(PI / 4), 1);
    }

    @Test
    public void tangent90ExpectedValueGreaterThanPI() {
        Assert.assertTrue(calculator.tg(PI / 2) > PI);
    }

    @Test
    public void tangent180() {
        Assert.assertEquals(calculator.tg(PI), 0);
    }
}
