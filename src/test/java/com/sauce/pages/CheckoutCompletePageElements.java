package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class CheckoutCompletePageElements extends CommonMethods {
	
		
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	public WebElement orderComplete;
	
	
	
	public CheckoutCompletePageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
				
}
