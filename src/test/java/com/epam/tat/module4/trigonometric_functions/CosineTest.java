package com.epam.tat.module4.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.data_provider.TrigonometricOperationDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @Test(dataProvider = "tableAngleCosine", dataProviderClass = TrigonometricOperationDataProvider.class)
    public void cosine(double angle, double expectedResult) {
        assertEquals(calculator.cos(angle), expectedResult);
    }
}
