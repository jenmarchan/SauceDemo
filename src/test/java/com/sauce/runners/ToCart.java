package com.sauce.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//we can specify which features to run
		features="src/test/resources/features/", 
		
		//we can specify where the codes for the features are 
		glue = "com.sauce.steps", 
		
		//if true, it does not run the java functionality in the steps. Only checks the feature files 
		//and if all the steps there are implemented.
		dryRun = false,
		
		monochrome=true, 
		
		//I can define a tag or a combination of tags to run scenarios that have those tags
		tags = "@addToCart",

		plugin = {
				// prints the Gherkin scenario(s) steps to the console
				"pretty",
				// creates and saves the basic html report in the target folder
				"html:target/cucumber-reports/cucumber-cart.html",
				// stores all executed steps in a json file
				"json:target/cucumber-reports/cucumber-cart.json"

		}
		
		)





public class ToCart {

}
