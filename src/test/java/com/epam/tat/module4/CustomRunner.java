package com.epam.tat.module4;

import com.epam.tat.module4.arithmetic_operation.AdditionTest;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import static org.testng.Reporter.log;

public class CustomRunner {
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
