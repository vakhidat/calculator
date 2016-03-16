package com.epam.tat.module4;

import com.epam.tat.module4.arithmetic_operations.Addition;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

import static org.testng.Reporter.log;

@Test
public class CustomRunnerTest {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { Addition.class });
        TestListenerAdapter listener = new TestListenerAdapter();
        tng.addListener(listener);
        tng.run();
        log("PASSED: " + listener.getPassedTests().size());
        log("FAILED: " + listener.getFailedTests().size());
    }
}
