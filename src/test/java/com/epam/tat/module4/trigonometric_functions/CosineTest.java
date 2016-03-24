package com.epam.tat.module4.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;


public class CosineTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public static void disposeCalculator() {
        calculator = null;
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
