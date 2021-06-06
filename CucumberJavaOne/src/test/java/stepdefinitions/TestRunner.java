package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// Tip: when you copy & past the path for the feature file properties, you wil lgett the backward slash, you just replace with forward slash
		// and it will work on any OS if you need to take this script and run on verious OS machines. 
		
		features="src/test/resources/features/googlesearch.feature",
		glue= {"stepdefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports","junit:target/junitXMLReports/Cucumber.xml"},
		monochrome = true
		)

public class TestRunner {

}
