package com.epam.tat.module4.trigonometric_functions;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.data_provider.TrigonometricOperationDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


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

    @Test(dataProvider = "tableAngleTangent",
            dataProviderClass = TrigonometricOperationDataProvider.class)
    public void tangent(double angle, double expectedResult) {
        assertEquals(calculator.tg(angle), expectedResult);
    }
}
