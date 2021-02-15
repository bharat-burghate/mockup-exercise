package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/mockupFeature.feature", // Path to our features files i.e. entry point
		glue = { "stepdefinitions" }, // Path to our step definition folder/package
		monochrome = true, // if true generates pretty output on console
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }, // to
																											// generate
		// different types
		// of reports
		strict = true, // executes all steps but throws PendingException if any step definition missing
						// for any feature file step
		dryRun = true// if true then does not executes any steps but checks mapping of feature file
						// steps with step definition if not then throws
						// UndefinedStepException
		
)

public class TestRunner {

}
