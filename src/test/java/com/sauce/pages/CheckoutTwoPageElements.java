package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class CheckoutTwoPageElements extends CommonMethods {
	
		
	@FindBy(id = "finish")
	public WebElement finishButton;
	
	
	
	public CheckoutTwoPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
				
}
