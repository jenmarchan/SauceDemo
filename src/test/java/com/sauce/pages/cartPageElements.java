package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class cartPageElements extends CommonMethods {
	
	
	@FindBy(id = "checkout")
	public WebElement checkout;
	
	public cartPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cartPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
