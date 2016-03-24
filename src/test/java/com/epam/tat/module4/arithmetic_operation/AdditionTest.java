package com.epam.tat.module4.arithmetic_operation;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.data_provider.ArithmeticOperationDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AdditionTest {
    private static Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public static void destroyCalculator() {
        calculator = null;
    }

    @Test(groups = "smoke",
            dataProvider = "twoLongPositive",
            dataProviderClass = ArithmeticOperationDataProvider.class)
    public void addTwoLongPositive(long summand1, long summand2, long sum) {
        assertEquals(calculator.sum(summand1, summand2), sum, "Summands: " + summand1 + ", " + summand2);
    }

    @Test(priority = 0, dataProvider = "longPositiveAndNegative",
            dataProviderClass = ArithmeticOperationDataProvider.class)
    public void addLongPositiveAndNegative(long summand1, long summand2, long sum) {
        assertEquals(calculator.sum(summand1, summand2), sum, "Summands: " + summand1 + ", " + summand2);
    }

    @Test(priority = 1, dataProvider = "twoLongNegative",
            dataProviderClass = ArithmeticOperationDataProvider.class)
    public void addTwoLongNegative(long summand1, long summand2, long sum) {
        assertEquals(calculator.sum(summand1, summand2), sum, "Summands: " + summand1 + ", " + summand2);
    }

    @Test(priority = 2)
    public void addPositiveLongAndZero() {
        assertEquals(calculator.sum(10L, 0), 10L, "Sum of 10 and 0");
    }

    @Test(groups = "smoke",
            dataProvider = "twoDoublePositive",
            dataProviderClass = ArithmeticOperationDataProvider.class,
    dependsOnMethods = "addTwoLongPositive",
    alwaysRun = true)
    public void addTwoDoublePositive(double summand1, double summand2, double sum) {
        assertEquals(calculator.sum(summand1, summand2), sum, "Summands: " + summand1 + ", " + summand2);
    }

    @Test(dependsOnMethods = "addTwoLongNegative")
    public void addTwoDoubleNegative() {
        assertEquals(calculator.sum(-5.1, -5.1), -10.2, "Sum of -5.1 and -5.1");
    }

    @Test(dependsOnMethods = "addPositiveLongAndZero")
    public void addPositiveDoubleAndZero() {
        assertEquals(calculator.sum(10.2, 0), 10.2, "Sum of 10.2 and 0");
    }
}
