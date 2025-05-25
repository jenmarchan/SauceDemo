package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.BaseClass;
import com.sauce.utils.CommonMethods;
import com.sauce.utils.ConfigsReader;

public class inventoryPageElements extends CommonMethods {
	
			
	@FindBy(xpath = "//span[text()='Products']")
	public WebElement inventory;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	
	public WebElement backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement tShirt;
	
	@FindBy(xpath = "//span[@data-test='shopping-cart-badge']")
	public WebElement productsInCar;
	
	public inventoryPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inventoryPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
