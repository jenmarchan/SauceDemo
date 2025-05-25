package com.sauce.testbase;
import com.sauce.pages.CheckoutCompletePageElements;
import com.sauce.pages.CheckoutOnePageElements;
import com.sauce.pages.CheckoutTwoPageElements;
import com.sauce.pages.LoginPageElements;
import com.sauce.pages.cartPageElements;
import com.sauce.pages.inventoryPageElements;


public class PageInitializer extends BaseClass {

	public static LoginPageElements loginPage;
	public static inventoryPageElements inventoryPage;
	public static cartPageElements cartPage;
	public static CheckoutOnePageElements checkoutPage ;
	public static CheckoutTwoPageElements finishPage ;
	public static CheckoutCompletePageElements orderCompletePage ;
	
	public static void initialize()  {
		
		loginPage = new LoginPageElements();
		inventoryPage = new inventoryPageElements ();
		cartPage = new cartPageElements();
		checkoutPage = new CheckoutOnePageElements ();
		finishPage = new CheckoutTwoPageElements ();
		orderCompletePage = new CheckoutCompletePageElements ();
	}

}