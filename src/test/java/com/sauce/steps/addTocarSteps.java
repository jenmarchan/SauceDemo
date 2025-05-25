package com.sauce.steps;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.sauce.pages.inventoryPageElements;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class addTocarSteps extends CommonMethods {
	
	@Given("the user has already logged in")
	public void the_user_has_already_logged_in() {
		
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		click(loginPage.logInButton);
	    
	}
	@When("Add two products to the cart")
	public void add_two_products_to_the_cart() {
		
		wait(4);
		click(inventoryPage.backpack);
		
		wait(1);
		click(inventoryPage.tShirt);
		
	}
		
	@When("Go to cart section")
	public void go_to_cart_section() {
		
		click(inventoryPage.productsInCar);
	   
	}
	@When("Clicks on the checkout button")
	public void clicks_on_the_checkout_button() {
		
		click(cartPage.checkout);
	    
	}
	
	@When("fill in the information section with first name, last name, and zip code.")
	public void fill_in_the_information_section_with_first_name_last_name_and_zip_code() {
		
		sendText(checkoutPage.firstName, ConfigsReader.getProperty("firstName"));
		sendText(checkoutPage.lastName, ConfigsReader.getProperty("lastName"));
		sendText(checkoutPage.zip, ConfigsReader.getProperty("zip"));
	   
	}
	@When("clicks on the continue button")
	public void clicks_on_the_continue_button() {
		
		click(checkoutPage.continueButton);
	   
	}
	@Then("the user verifies that the purchase was successful")
	public void the_user_verifies_that_the_purchase_was_successful() {
	    
		click(finishPage.finishButton);
		
		waitForVisibility(orderCompletePage.orderComplete);
		
	}

	
	
}
	
		
	


	

