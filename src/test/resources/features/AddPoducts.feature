
#Author: Jenny Marchán

@addToCart
Feature: Test Case II- Buy on SauceDemo  

 Background:  
 
Given the user navigates to the home page
    
Scenario: Add two products to the cart and complete purchase
 
When the user has already logged in 
And Add two products to the cart
And Go to cart section
And Clicks on the checkout button
And fill in the information section with first name, last name, and zip code.
And clicks on the continue button
Then the user verifies that the purchase was successful

 