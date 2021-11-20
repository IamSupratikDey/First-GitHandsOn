package com.bdd.StepDefination;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;
import com.bdd.pageobject.SearchBox;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchBoxStepDefination extends Resource {
	
	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	SearchBox sb = new SearchBox();
    
	
	@When("^User Type \"([^\"]*)\"$")
	public void user_Type(String arg1) throws Throwable {
	    
		sb.clickonSearchbox(driver);
		driver.findElement(ct.searchbox).sendKeys(arg1);
		
	}

	@When("^Select Birthday gift for men form the dropdown$")
	public void select_Birthday_gift_for_men_form_the_dropdown() throws Throwable {
		
		driver.findElement(ct.searchbox).sendKeys(Keys.ARROW_DOWN.ENTER);
	    
	}

	@Then("^New page with gift for men will open which will contain -Birthday gifts for men text$")
	public void new_page_with_gift_for_men_will_open_which_will_contain_Birthday_gifts_for_men_text() throws Throwable {
	    
        String mgifts = driver.findElement(ct.men_gifts).getText();
		
		if(mgifts.equalsIgnoreCase("Birthday gifts for men"))
		{
			logger.info("User on correct page");
			System.out.println("Scenario : verify search box is functionality  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
			
		}
	}


}
