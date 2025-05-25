
#Author: Jenny Marchán

@Login
Feature: Test Case I- Login in SauceDemo

 Background:  
 Given the user navigates to the home page
  
 
 Scenario: Successful login with valid credentials 

When the user enters a valid username
And the user enters a valid password
And the user clicks on the Log In button
Then Validate that user can view the "Products" page

 Scenario: Login with invalid credentials
 When the user enters a valid username
 And the user enters a invalid password
 And user clicks on the Log in button
 Then Validate that a message for an incorrect username or password is displayed
 
 Scenario: Empty username
 When The user did not enter a username
 And the user enters a valid password
 And the user clicks on the Log In button
 Then Validate that the username field is empty 
 
 Scenario: Empty password
 When the user enters a valid username
 And The user did not enter a password
 And the user clicks on the Log in button
 Then Validate that the password field is empty
 