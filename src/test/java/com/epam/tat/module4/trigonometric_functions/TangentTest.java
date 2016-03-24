package com.epam.tat.module4.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class TangentTest {
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
    public void tangent0() {
        assertEquals(calculator.tg(0), 0);
    }

    @Test
    public void tangent45() {
        assertEquals(calculator.tg(PI / 4), 1);
    }

    @Test
    public void tangent90ExpectedValueGreaterThanPI() {
        assertTrue(calculator.tg(PI / 2) > PI);
    }

    @Test
    public void tangent180() {
        assertEquals(calculator.tg(PI), 0);
    }
}
