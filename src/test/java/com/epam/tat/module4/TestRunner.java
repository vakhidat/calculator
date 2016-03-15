package com.epam.tat.module4;

import lombok.extern.slf4j.Slf4j;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

@Slf4j
public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { AdditionTest.class });
        TestListenerAdapter listener = new TestListenerAdapter();
        tng.addListener(listener);
        tng.run();
        listener.getPassedTests().stream().forEach(System.out::println);
        log.info("PASSED: {}", listener.getPassedTests().size());
        log.info("FAILED: {}", listener.getFailedTests().size());
    }
}
