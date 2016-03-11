package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;

public class TestSuite {
    @BeforeClass
    public static void createCalculator() {
        Calculator calculator = new Calculator();
    }
}
