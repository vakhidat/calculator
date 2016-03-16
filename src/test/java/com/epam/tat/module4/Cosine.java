package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;

public class Cosine {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void cosine0() {
        assertEquals(calculator.cos(0), 1.0);
    }

    @Test
    public void cosine45() {
        assertEquals(calculator.cos(PI / 4), 0.7071067811865475);
    }

    @Test
    public void cosine90() {
        assertEquals(calculator.cos(PI / 2), 0);
    }

    @Test
    public void cosine180() {
        assertEquals(calculator.cos(PI), -1);
    }
}
