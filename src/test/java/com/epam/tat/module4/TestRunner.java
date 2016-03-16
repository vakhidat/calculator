package com.epam.tat.module4;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

@Slf4j
public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { Cosine.class });
        TestListenerAdapter listener = new TestListenerAdapter();
        tng.addListener(listener);
        tng.run();
        listener.getPassedTests().stream().forEach(TestRunner::onTestSuccess);
        log.info("PASSED: {}", listener.getPassedTests().size());
        log.info("FAILED: {}", listener.getFailedTests().size());
    }

    public static void onTestSuccess(ITestResult result) {
        /*long time = (result.getEndMillis() - result.getStartMillis());
        log.info("Success, method: {}  #parameters: {}  time: {}", result.getMethod(), result.getParameters().length, time);*/
        ITestNGMethod method = result.getMethod();
        log.info("  Method: {} invocationCount: {} #groups: {} timeOut: {}",
                method.getMethodName(), method.getInvocationCount(),  method.getGroups().length, method.getTimeOut());
    }
}
