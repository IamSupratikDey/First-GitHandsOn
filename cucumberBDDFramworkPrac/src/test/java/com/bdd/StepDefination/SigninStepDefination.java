package com.bdd.StepDefination;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.bdd.pageobject.GiftCard;
import com.bdd.pageobject.HomePage;
import com.bdd.pageobject.Signin;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.ExcelUtility;
import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninStepDefination extends Resource{
	
	ContactusStore ct = new ContactusStore();
	Signin sp = new Signin();
	BaseCases bc = new BaseCases();
	
	@Given("^User should be on sign in page$")
	public void user_should_be_on_sign_in_page() throws Throwable {
	    sp.sign(driver);
	}  

	@When("^Click on sign in$")
	public void click_on_sign_in() throws Throwable {
	    
	    logger.info("User clicks on sign in");
	}

	@When("^Provide wrong credential$")
	public void provide_wrong_credential() throws Throwable {
	    
		ExcelUtility el = new ExcelUtility();
		ArrayList<String>data = el.getData("a");
		System.out.println(data.size());
		
		String mail1 = (String) data.get(1);
		String pass1 = data.get(2);
		driver.findElement(ct.mail).sendKeys(mail1);
		driver.findElement(ct.pass).sendKeys(pass1);
		Thread.sleep(3000);
		driver.findElement(ct.signin).click();
	}

	@Then("^The page should contain Incorrect email or password$")
	public void the_page_should_contain_Incorrect_email_or_password() throws Throwable {
	    
	   
	}
}
