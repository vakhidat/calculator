package com.epam.tat.module4.test.data_provider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class ArithmeticOperationDataProvider {
    @DataProvider(name = "twoLongPositive", parallel = true)
    public static Object[][] createTwoLongPositiveWithResult(Method m) {
        return new Object[][]{
                new Object[]{2, 2, 4},
                new Object[]{Long.MAX_VALUE, 1, Long.MAX_VALUE},
                new Object[]{Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE},
        };
    }

    @DataProvider(name = "twoDoublePositive", parallel = true)
    public static Object[][] createTwoDoublePositiveWithResult(Method m) {
        return new Object[][]{
                new Object[]{2.2, 2.2, 4.4},
                new Object[]{Double.MAX_VALUE, 1.1, Double.MAX_VALUE},
                new Object[]{Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
        };
    }
}
