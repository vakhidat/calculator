package com.epam.tat.module4.power_sqrt;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtTest {
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
    public void sqrtPositive() {
        assertEquals(calculator.sqrt(4), 2.0, "sqrt of 4");
    }

    @Test
    public void sqrtNegativeExpectNaN() {
        assertEquals(calculator.sqrt(-4), Double.NaN);
    }

    @Test
    public void sqrtZeroExpectZero() {
        assertEquals(calculator.sqrt(0), 0.0);
    }

    @Test
    public void sqrtDecimal() {
        assertEquals(calculator.sqrt(1.2), 1.0954451150103321, "sqrt of 1.2");
    }

    @Test
    public void sqrtOneExpectOne() {
        assertEquals(calculator.sqrt(1), 1.0);
    }
}
