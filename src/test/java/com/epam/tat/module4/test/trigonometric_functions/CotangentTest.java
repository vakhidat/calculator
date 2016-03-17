package com.epam.tat.module4.test.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Math.PI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CotangentTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void cotangent0ExpectedValueGreaterThanPI() {
        assertTrue(calculator.ctg(0) > PI);
    }

    @Test
    public void cotangent45() {
        assertEquals(calculator.ctg(PI / 4), 1);
    }

    @Test
    public void cotangent90() {
        assertEquals(calculator.ctg(PI / 2), 0);
    }

    @Test
    public void cotangent180ExpectedValueGreaterThanPI() {
        assertTrue(calculator.ctg(PI) > PI);
    }
}