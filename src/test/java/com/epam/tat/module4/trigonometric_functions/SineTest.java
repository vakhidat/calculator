package com.epam.tat.module4.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;


public class SineTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sine0() {
        assertEquals(calculator.sin(0), 0);
    }

    @Test
    public void sine45() {
        assertEquals(calculator.sin(PI / 4), 0.7071067811865475);
    }

    @Test
    public void sine90() {
        assertEquals(calculator.sin(PI / 2), 1.0);
    }

    @Test
    public void sine180() {
        assertEquals(calculator.sin(PI), 0);
    }
}
