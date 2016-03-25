package com.epam.tat.module4;

import jdk.internal.org.xml.sax.SAXException;
import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class CustomRunnerSuitesInCode {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        XmlSuite suite = new XmlSuite();
        suite.setName("SmokeSuite");
        suite.setVerbose(1);
        suite.setThreadCount(2);
        XmlTest test = new XmlTest(suite);
        test.setName("Smoke");
        test.setIncludedGroups(Collections.singletonList("smoke"));
        XmlPackage[] xmlPackage = new XmlPackage[]{
                new XmlPackage("com.epam.tat.module4.*")};
        test.setXmlPackages(Arrays.asList(xmlPackage));

        TestNG tng = new TestNG(true);
        tng.setXmlSuites(Collections.singletonList(suite));
        tng.run();
    }
}