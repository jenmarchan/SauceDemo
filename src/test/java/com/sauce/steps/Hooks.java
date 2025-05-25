package com.sauce.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;



public class Hooks extends CommonMethods {

	@Before
	public void start() {
		BaseClass.setUp();
	}

	@After
	public void end(Scenario scenario) {

		byte[] screenshot;
		
		if (scenario.isFailed()) {
			// take a screenshot and put it under "failed" folder
			screenshot = takeScreenShot("failed/" + scenario.getName());
		} else {
			// take a screenshot and put it under "passed" folder
			screenshot = takeScreenShot("passed/" + scenario.getName());
		}

		scenario.attach(screenshot, "image/png", scenario.getName());
		BaseClass.tearDown();
	}

}
