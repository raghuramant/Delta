package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/FlightSearchOneWayModule.feature", glue = "com.stepDefinition", dryRun = false, tags = {
		"@tag1", "@run" })
public class JunitRunner {

}
