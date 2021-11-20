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

public class HomePageStepDefination extends Resource {
    
	ContactusStore ct = new ContactusStore();
	HomePage hp = new HomePage();
	BaseCases bc = new BaseCases();
	
	
	@Given("^The Browser URl$")
	public void the_Browser_URl() throws Throwable {
	 
		bc.setup();
		
	} 

	@When("^User click on the URL$")
	public void user_click_on_the_URL() throws Throwable {
		
		hp.OpenBrowser(driver);
	    
	}

	@Then("^The Website Should open$")
	public void the_Website_Should_open() throws Throwable {
	    
		String title = driver.getTitle();
		System.out.println(title);
		//Validating the title of the website 
		if(title.equalsIgnoreCase("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts� Bigsmall.in"))
		{
			logger.info("User is on correct WebPage");
			System.out.println("Website is Validate");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
}
