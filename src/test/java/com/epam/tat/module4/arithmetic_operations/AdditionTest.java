package com.epam.tat.module4.arithmetic_operations;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.assertEquals;

@Test
public class AdditionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @DataProvider(name = "twoLongPositive")
    public Object[][] createData(Method m) {
        return new Object[][]{
                new Object[]{2, 2, 4},
                new Object[]{Long.MAX_VALUE, 1, Long.MAX_VALUE},
                new Object[]{Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE},
        };
    }

    @Test(groups = "smoke", dataProvider = "twoLongPositive")
    public void addTwoLongPositive(long summand1, long summand2, long sum) {
        assertEquals(calculator.sum(summand1, summand2), sum, "Summands: " + summand1 + ", " + summand2);
    }

    @Test
    public void addLongPositiveAndNegative() {
        assertEquals(calculator.sum(15L, -5L), 10L, "Sum of 15 and -5");
    }

    @Test
    public void addTwoLongNegative() {
        assertEquals(calculator.sum(-5L, -5L), -10L, "Sum of -5 and -5");
    }

    @Test
    public void addPositiveLongAndZero() {
        assertEquals(calculator.sum(10L, 0), 10L, "Sum of 10 and 0");
    }

    @Test(groups = "smoke")
    public void addTwoDoublePositive() {
        assertEquals(calculator.sum(5.1, 5.1), 10.2, "Sum of 5.1 and 5.1");
    }

    @Test
    public void addTwoDoubleNegative() {
        assertEquals(calculator.sum(-5.1, -5.1), -10.2, "Sum of -5.1 and -5.1");
    }

    @Test
    public void addPositiveDoubleAndZero() {
        assertEquals(calculator.sum(10.2, 0), 10.2, "Sum of 10.2 and 0");
    }
}
