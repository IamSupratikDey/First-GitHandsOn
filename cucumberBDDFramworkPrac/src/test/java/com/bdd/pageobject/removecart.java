package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;


public class removecart extends Resource{
	
	ContactusStore ct = new ContactusStore();
	public void remove_cart(WebDriver driver)
	{
		driver.navigate().to(browserURL);
	    driver.findElement(ct.rcart).click();	
	}

}
