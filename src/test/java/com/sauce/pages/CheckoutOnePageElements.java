package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class CheckoutOnePageElements extends CommonMethods {
	
	
	@FindBy(id = "first-name")
	public WebElement firstName;
	
	@FindBy(id = "last-name")
	public WebElement lastName;
	
	@FindBy(id = "postal-code")
	public WebElement zip;
	
	@FindBy(id = "continue")
	public WebElement continueButton;
	
	
	
	public CheckoutOnePageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CheckoutOnePageElements ()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}
