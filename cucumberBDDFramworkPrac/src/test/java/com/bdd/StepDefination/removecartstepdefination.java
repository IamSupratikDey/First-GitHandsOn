package com.bdd.StepDefination;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.HomePage;
import com.bdd.pageobject.removecart;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class removecartstepdefination extends Resource {

	ContactusStore ct = new ContactusStore();
	removecart rc = new removecart();
	BaseCases bc = new BaseCases();
	
	@Given("^Some items is in cart$")
	public void some_items_is_in_cart() throws Throwable {
	    logger.info("Item is present on the Cart");
	}
	@When("^User Go to cart$")
	public void user_Go_to_cart() throws Throwable {
		rc.remove_cart(driver);
		Thread.sleep(3000);
	}

	@When("^click Remove item form the cart$")
	public void click_Remove_item_form_the_cart() throws Throwable {
		driver.findElement(ct.removeButton).click();
		Thread.sleep(3000);
	}

	@Then("^The items should be removed and  verify the page contains cart is empty$")
	public void the_items_should_be_removed_and_verify_the_page_contains_cart_is_empty() throws Throwable {
    String emptycart = driver.findElement(ct.cartEmpty).getText();
		
		if(emptycart.equalsIgnoreCase("Your cart is currently empty."))
		{
			logger.info("Remove Feature is succesfully validated");
			System.out.println("TestCase :Cart_feature_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}

	
}
