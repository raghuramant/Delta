package com.stepDefinition;

import com.resources.Utilities;

import cucumber.api.java.en.Given;

public class CommonSteps {
	@Given("^User is in Delta WebPage$")
	public void user_is_in_Delta_WebPage() throws Throwable {
	   Utilities.launchURL("https://www.delta.com/");
	   
	}

}
