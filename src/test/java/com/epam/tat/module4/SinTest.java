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
        Assert.assertEquals(round(calculator.sin(45)), 1);
    }

    @Test
    public void sin90() {
        Assert.assertEquals(calculator.sin(90), 1);
    }

    @Test
    public void sin180() {
        Assert.assertEquals(calculator.sin(180), 0);
    }

    @Test
    public void sin0() {
        Assert.assertEquals(calculator.sin(0), 0);
    }

    @Test
    public void sinNegativeNumber() {
        calculator.sin(-23);
    }
}
