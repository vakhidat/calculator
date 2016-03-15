package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.*;

public class SineTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sine0() {
        Assert.assertEquals(calculator.sin(0), 0);
    }

    @Test
    public void sine45() {
        Assert.assertEquals(calculator.sin(PI/4), 0.7071067811865475);
    }

    @Test
    public void sine90() {
        Assert.assertEquals(calculator.sin(PI/2), 1.0);
    }

    @Test
    public void sine180() {
        Assert.assertEquals(calculator.sin(PI), 0);
    }
}
