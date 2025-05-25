package com.sauce.steps;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.sauce.pages.inventoryPageElements;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class LoginSteps extends CommonMethods {
	
	@Given("the user navigates to the home page")
	public void the_user_navigates_to_the_home_page() {
	   
	}
	
	@When("the user enters a valid username")
	public void the_user_enters_a_valid_username() {   
		    
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
	}
	
	@When("the user enters a valid password")
	public void the_user_enters_a_valid_password() {
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}
	
			
					    	
	@Then("Validate that user can view the {string} page")
	public void validate_that_user_can_view_the_page(String expectedName) {
		
		inventoryPageElements inventoryPage = new inventoryPageElements();
	    
		waitForVisibility(inventoryPage.inventory);
	    
	    String actualName = inventoryPage.inventory.getText().trim();
	    
	    Assert.assertEquals("The user name does NOT match!", expectedName, actualName);
	   
	}
	
	@Given("the user clicks on the Log In button")
	public void the_user_clicks_on_the_log_in_button() {
		
		click(loginPage.logInButton);
	}
	
	
	
	@When("the user enters a invalid password")
	public void the_user_enters_a_invalid_password() {
		
		sendText(loginPage.password, "WrongPassword!");
	    
	}
	
	
	@When("user clicks on the Log in button")
	public void user_clicks_on_the_log_in_button() {
		click(loginPage.logInButton);
	}
	
	@Then("Validate that a message for an incorrect username or password is displayed")
	public void validate_that_a_message_for_an_incorrect_username_or_password_is_displayed() {
	    
		waitForVisibility(loginPage.errorButton);
	}

	
	@When("The user did not enter a username")
	public void the_user_did_not_enter_a_username() {
		sendText(loginPage.username, "");
	}
	
	
	@Then("Validate that the username field is empty")
	public void validate_that_the_username_field_is_empty() {
	   
		Assert.assertFalse("Username is required", loginPage.password.getAttribute("value").isEmpty());
	}
	
	
	@When("The user did not enter a password")
	public void the_user_did_not_enter_a_password() {
		
		sendText(loginPage.password, "");
	    
	}
	@When("the user clicks on the Log in button")
	public void the_user_clicks_on_the_log_in_button1() {
		click(loginPage.logInButton);
	    
	}
	@Then("Validate that the password field is empty")
	public void validate_that_the_password_field_is_empty() {
		Assert.assertFalse("Password is required", loginPage.username.getAttribute("value").isEmpty());
	}

}
	
		
	


	

