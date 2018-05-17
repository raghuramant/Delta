package com.stepDefinition;

import com.resources.Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
@Before
public void beforeScenario(){
	Utilities.browserOpen();
}

@After
public void afterScenario(){
	Utilities.browserClose();
}
}
