package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Tangent {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
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
