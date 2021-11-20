package com.bdd.StepDefination;

import org.testng.Assert;

import com.bdd.pageobject.CartItem;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartItemStepDefination extends Resource{

	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	CartItem ci = new CartItem();
	
	@Given("^User on desired website$")
	public void user_on_desired_website() throws Throwable {
	    
	    logger.info("User is on website");
	}

	@When("^User Navigate to Shopping Category and clicks on the Travel Gifts$")
	public void user_Navigate_to_Shopping_Category_and_clicks_on_the_Travel_Gifts() throws Throwable {
	   
	    ci.shp(driver);
	    driver.findElement(ct.TravelGifts).click();
		Thread.sleep(3000);
	}

	@When("^Choose Mask frogg Eye Mask$")
	public void choose_Mask_frogg_Eye_Mask() throws Throwable {
	    
		driver.findElement(ct.Item).click();
		Thread.sleep(3000);
	}

	@When("^User do add to cart continue Shopping$")
	public void user_do_add_to_cart_continue_Shopping() throws Throwable {
	   
		driver.findElement(ct.Cart).click();
		Thread.sleep(2000);
	}

	@Then("^Item will be  added to shopping cart$")
	public void item_will_be_added_to_shopping_cart() throws Throwable {
	    
		Assert.assertTrue(driver.findElement(ct.itemCart).isDisplayed());
		boolean display = driver.findElement(ct.itemCart).isDisplayed();
	    
		System.out.println(display);
		
		System.out.println("To add item in Shopping Cart : Scenario passed");
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");
	    
	}


}
