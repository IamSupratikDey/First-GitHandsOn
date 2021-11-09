package com.bdd.StepDefination;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.Powder;
import com.bdd.pageobject.TideHomePage;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUSStepdefination extends Resource {
    
	
	TideHomePage th = new TideHomePage();
	ContactusStore ct = new ContactusStore();
	BaseCases bc=new BaseCases();
	Powder pd = new Powder();
	TakeScreenShot ts = new TakeScreenShot();
	
	@Given("^Browser Url$")
	public void browser_Url() throws Throwable {
	    
		bc.setup();
		th.clickonbrowserurl(driver);
		driver.manage().window().maximize();
		
	}

	@When("^User hover on the Shop Products$")
	public void user_hover_on_the_Shop_Products() throws Throwable {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(ct.shopproduct)).build().perform();
		Thread.sleep(3000);
		
	}

	@When("^User choose powder form the drop down$")
	public void user_choose_powder_form_the_drop_down() throws Throwable {
	   pd.cpowder(driver);
	}

	@Then("^Five Product list page opened$")
	public void five_Product_list_page_opened() throws Throwable {
		String title = driver.findElement(ct.detergent).getText();
		System.out.println(title);
		
		
		if(title.equalsIgnoreCase("Free and Gentle"))
		{
			logger.info("Tide Free and Gentle powder is listed in 5 products lis");
		}
		
		
		System.out.println("First Test Case Verified");
		System.out.println("------------------------------------");
		System.out.println("\n");
	}

	
	
	@Given("^The Website page$")
	public void the_Website_page() throws Throwable {
	    logger.info("This is the current Webpage");
	}

	@When("^User enter the product \"([^\"]*)\"$")
	public void user_enter_the_product(String arg1) throws Throwable {
	    
		driver.findElement(ct.searchbox).sendKeys(arg1);
		Thread.sleep(3000);
	}

	@When("^User clicks on the search icon$")
	public void user_clicks_on_the_search_icon() throws Throwable {
		driver.findElement(ct.searchIcon).click();
	}

	@Then("^New Product page shoild open$")
	public void new_Product_page_shoild_open() throws Throwable {
	    logger.info("New Product Page Based on Search");
	    
	    System.out.println("Second Test Case Verified");
		System.out.println("------------------------------------");
		System.out.println("\n");
		
		bc.close();
	}



	
	


	
}
