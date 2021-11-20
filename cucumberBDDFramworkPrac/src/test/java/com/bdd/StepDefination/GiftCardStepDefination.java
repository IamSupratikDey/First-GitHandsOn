package com.bdd.StepDefination;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.GiftCard;
import com.bdd.pageobject.HomePage;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GiftCardStepDefination extends Resource {

	ContactusStore ct = new ContactusStore();
	GiftCard gc=new GiftCard();
	BaseCases bc = new BaseCases();
	
	@Given("^Gift Card should be present in the website$")
	public void gift_Card_should_be_present_in_the_website() throws Throwable {
	    logger.info("Gift Card feature is present");
	}

	@When("^User Navigate to gift card$")
	public void user_Navigate_to_gift_card() throws Throwable {
		gc.giftcard(driver);
	}

	@When("^click on that$")
	public void click_on_that() throws Throwable {
	    logger.info("User clicks");
	}

	@Then("^new page will open veify the new page contains the text Rs\\.$")
	public void new_page_will_open_veify_the_new_page_contains_the_text_Rs() throws Throwable {
	    
         String card = driver.findElement(ct.rupees).getText();
		
		if(card.equalsIgnoreCase("Rs. 500"))
		{
			logger.info("giftcard features succesfully validate");
			
			System.out.println("TestCase :Gift_Card_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}


}
