package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.*;

public class SinTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sin45() {
        Assert.assertEquals(1, round(calculator.sin(45)));
    }

    @Test
    public void sin90() {
        Assert.assertEquals(1, calculator.sin(90));
    }

    @Test
    public void sin180() {
        Assert.assertEquals(0, calculator.sin(180));
    }

    @Test
    public void sin0() {
        Assert.assertEquals(0, calculator.sin(0));
    }

    @Test
    public void sinNegativeNumber() {
        calculator.sin(-23);
    }
}
