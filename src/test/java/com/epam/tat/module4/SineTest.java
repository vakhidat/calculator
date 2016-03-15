package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.*;

public class SineTest {
    private static Calculator calculator;
    private double angle;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sin45() {
        angle = toRadians(45);
        Assert.assertEquals(calculator.sin(angle), 0.7071);
    }

    @Test
    public void sin90() {
        angle = toRadians(90);
        Assert.assertEquals(calculator.sin(angle), 1);
    }

    @Test
    public void sin180() {
        angle = toRadians(180);
        Assert.assertEquals(calculator.sin(angle), 0);
    }

    @Test
    public void sin0() {
        angle = toRadians(0);
        Assert.assertEquals(calculator.sin(angle), 0);
    }

    @Test
    public void sinNegativeNumber() {
        angle = toRadians(-90);
        Assert.assertEquals(calculator.sin(angle), -1, "angle is -90 degrees");

    }
}
