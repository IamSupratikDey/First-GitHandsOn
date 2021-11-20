package com.bdd.StepDefination;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.HomePage;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishLIstStepDefination extends Resource{
   
	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	@Given("^User is on What's New Page$")
	public void user_is_on_What_s_New_Page() throws Throwable {
	    
		logger.info("This is What's New Page");
	    
	}

	@When("^Select Friends Bobblehead click on Add to wishlist$")
	public void select_Friends_Bobblehead_click_on_Add_to_wishlist() throws Throwable {
	    
		driver.findElement(ct.Bobblehead).click();
		Thread.sleep(4000);
		driver.findElement(ct.wishlist).click();
		Thread.sleep(3000);
	}

	@Then("^Wishlist will open with that Item$")
	public void wishlist_will_open_with_that_Item() throws Throwable {
	    
		driver.findElement(ct.wishlistmenu).click();
		Thread.sleep(3000);
		driver.findElement(ct.access).click();
		Thread.sleep(3000);
		String addset = driver.findElement(ct.add).getText();
		System.out.println(addset);
	}


}
