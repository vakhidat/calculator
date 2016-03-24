package com.epam.tat.module4.arithmetic_operation;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SubtractionTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public static void disposeCalculator() {
        calculator = null;
    }

    @Test(groups = "smoke")
    public void subtractTwoLongPositive() {
        assertEquals(calculator.sub(15L, 5L), 10L, "SubtractionTest of 15 and 5");
    }

    @Test
    public void subtractLongPositiveAndNegative() {
        assertEquals(calculator.sub(5L, -5L), 10L, "SubtractionTest of 15 and 5");
    }

    @Test
    public void subtractTwoLongNegative() {
        assertEquals(calculator.sub(-15L, -5L), -10L, "SubtractionTest of 15 and 5");
    }

    @Test
    public void subtractPositiveLongAndZero() {
        assertEquals(calculator.sub(10L, 0), 10L, "SubtractionTest of 10 and 0");
    }

    @Test(groups = "smoke")
    public void subtractTwoDoublePositive() {
        assertEquals(calculator.sub(15.1, 5.1), 10.0, "SubtractionTest of 15.1 and 5.1");
    }

    @Test
    public void subtractTwoDoubleNegative() {
        assertEquals(calculator.sub(-15.1, -5.1), -10.0, "SubtractionTest of -15.1 and -5.1");
    }

    @Test
    public void subtractPositiveDoubleAndZero() {
        assertEquals(calculator.sub(10.2, 0), 10.2, "SubtractionTest of 10.2 and 0");
    }
}
