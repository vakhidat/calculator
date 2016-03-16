package com.epam.tat.module4;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import static org.testng.Reporter.log;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { AdditionTest.class });
        TestListenerAdapter listener = new TestListenerAdapter();
        tng.addListener(listener);
        tng.run();
        log("PASSED: " + listener.getPassedTests().size());
        log("FAILED: " + listener.getFailedTests().size());
    }
}
