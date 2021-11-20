package com.bdd.StepDefination;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.HomePage;
import com.bdd.pageobject.WhatsNew;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhatsNewStepDefination extends Resource {
 
	ContactusStore ct = new ContactusStore();
	WhatsNew wn = new WhatsNew();
	BaseCases bc = new BaseCases();
	
	
	@Given("^User is on Whats New Page$")
	public void user_is_on_Whats_New_Page() throws Throwable {
	    logger.info("This is What's New Page");
	    
	}
	@When("^User click on the box Whats New$")
	public void user_click_on_the_box_Whats_New() throws Throwable {
	    
	    wn.clickonWhatsNew(driver);
	    driver.findElement(ct.whatsnew).click();
	}

	@Then("^New Page will open containing the text What's New$")
	public void new_Page_will_open_containing_the_text_What_s_New() throws Throwable {
	    
		String wntext = driver.findElement(ct.wnpage).getText();
		System.out.println(wntext);
		
		if(wntext.equalsIgnoreCase("What'S New"))
		{
			logger.info("User is What'S New PAage");
			
			System.out.println("TestCase :Feature_Validation_1  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}


	
}
