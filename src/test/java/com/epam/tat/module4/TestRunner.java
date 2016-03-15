package com.epam.tat.module4;

import lombok.extern.slf4j.Slf4j;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

@Slf4j
public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { SumTest.class });
        TestListenerAdapter listener = new TestListenerAdapter();
        tng.addListener(listener);
        tng.run();
        log.debug("PASSED: {}", listener.getPassedTests().size());
    }
}
