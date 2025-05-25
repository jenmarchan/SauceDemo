package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods {
	
	@FindBy(id = "user-name")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "login-button")
	public WebElement logInButton;
	
	@FindBy(xpath = "//button[@data-test='error-button']")
	public WebElement errorButton;
	
	@FindBy(xpath = "//button[@data-test='error-button']")
	public WebElement emptyUser;
	
	
	
	public LoginPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void adminLogin()
	{
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(logInButton);
	}
	
	
}
