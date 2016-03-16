package com.epam.tat.module4;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { Addition.class });
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

    public void fromBook() {
        XmlSuite suite = new XmlSuite();
        suite.setName("TestNG JDK 1.5");
        suite.setVerbose(1);
        suite.setThreadCount(2);
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("first-name", "Cedric");
        suite.setParameters(parameters);
        XmlTest test = new XmlTest(suite);
        test.setName("Regression1");
        test.setExcludedGroups(Arrays.asList(
                new String[]{"excludedGroup}"}));
        XmlClass[] classes = new XmlClass[] {
                new XmlClass("test.parameters.ParameterSample"),
                new XmlClass("test.parameters.ParameterTest"),
        };
        test.setXmlClasses(Arrays.asList(classes));
// Now that we have a valid XmlSuite, we can pass it directly
// to TestNG
        TestNG tng = new TestNG();
        tng.setXmlSuites(Arrays.asList(new XmlSuite[] { suite }));
        tng.run();
    }
}
