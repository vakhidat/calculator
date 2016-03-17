package com.epam.tat.module4;

import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class CustomRunner {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        TestNG tng = new TestNG(true);
        final Parser parser = new Parser("src/test/resources/smoke.xml");
        final List<XmlSuite> suites = parser.parseToList();
        tng.setXmlSuites(suites);
        tng.run();
    }
}
