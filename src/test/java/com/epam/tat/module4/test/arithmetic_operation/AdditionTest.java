package com.epam.tat.module4.test.arithmetic_operation;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.test.data_provider.ArithmeticOperationDataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AdditionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test(groups = "smoke", dataProvider = "twoLongPositive", dataProviderClass = ArithmeticOperationDataProvider.class)
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