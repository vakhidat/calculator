package com.epam.tat.module4.data_provider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

import static java.lang.Math.PI;

public class TrigonometricOperationDataProvider {

    public static final int ZERO_ANGLE = 0;
    public static final double PI_QUARTER = PI / 4;
    public static final double PI_HALF = PI / 2;

    @DataProvider(name = "tableAngleCosine", parallel = true)
    public static Object[][] createTableAngleValuesInRadiansForCosine(Method m) {
        return new Object[][]{
                new Object[]{ZERO_ANGLE, Math.cos(ZERO_ANGLE)},
                new Object[]{PI_QUARTER, Math.cos(PI_QUARTER)},
                new Object[]{PI_HALF, Math.cos(PI_HALF)},
                new Object[]{PI, Math.cos(PI)},
        };
    }

    @DataProvider(name = "tableAngleSine", parallel = true)
    public static Object[][] createTableAngleValuesInRadiansForSine(Method m) {
        return new Object[][]{
                new Object[]{ZERO_ANGLE, Math.sin(ZERO_ANGLE)},
                new Object[]{PI_QUARTER, Math.sin(PI_QUARTER)},
                new Object[]{PI_HALF, Math.sin(PI_HALF)},
                new Object[]{PI, Math.sin(PI)},
        };
    }

    @DataProvider(name = "tableAngleTangent", parallel = true)
    public static Object[][] createTableAngleValuesInRadiansForTangent(Method m) {
        return new Object[][]{
                new Object[]{ZERO_ANGLE, Math.tan(ZERO_ANGLE)},
                new Object[]{PI_QUARTER, Math.tan(PI_QUARTER)},
                new Object[]{PI_HALF, Math.tan(PI_HALF)},
                new Object[]{PI, Math.tan(PI)},
        };
    }

    @DataProvider(name = "tableAngleCotangent", parallel = true)
    public static Object[][] createTableAngleValuesInRadiansForCotangent(Method m) {
        return new Object[][]{
                new Object[]{ZERO_ANGLE, 1/Math.tan(ZERO_ANGLE)},
                new Object[]{PI_QUARTER, 1/Math.tan(PI_QUARTER)},
                new Object[]{PI_HALF, 1/Math.tan(PI_HALF)},
                new Object[]{PI, 1/Math.tan(PI)},
        };
    }
}
