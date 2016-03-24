package com.epam.tat.module4.data_provider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class AdditionOperationDataProvider {
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
    @DataProvider(name = "longPositiveAndNegative", parallel = true)
    public static Object[][] createLongPositiveAndNegativeWithResult(Method m) {
        return new Object[][]{
                new Object[]{-5, 15, 10},
                new Object[]{5, -15, -10},
                new Object[]{Long.MIN_VALUE, 1, -9223372036854775807L},
                new Object[]{Long.MIN_VALUE, Long.MAX_VALUE, -1},
        };
    }

    @DataProvider(name = "twoDoubleNegative", parallel = true)
    public static Object[][] createAddTwoDoubleNegativeWithResult(Method m) {
        return new Object[][]{
                new Object[]{-5.1, -5.1, -10.2},
                new Object[]{5, -15, -10},
                new Object[]{Double.MIN_VALUE, -1, Double.MIN_VALUE},
                new Object[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE},
        };
    }

    @DataProvider(name = "twoLongNegative", parallel = true)
    public static Object[][] createTwoLongNegativeWithResult(Method m) {
        return new Object[][]{
                new Object[]{-5, -15, 20},
                new Object[]{5, -15, -10},
                new Object[]{Long.MIN_VALUE, 1, -9223372036854775807L},
                new Object[]{Long.MIN_VALUE, Long.MAX_VALUE, -1},
        };
    }

}
