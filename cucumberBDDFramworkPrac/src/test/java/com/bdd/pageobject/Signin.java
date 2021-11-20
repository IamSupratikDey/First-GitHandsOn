package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;

public class Signin extends Resource {
   
	ContactusStore ct = new ContactusStore();
	 
	public void sign(WebDriver driver)
	{
	     driver.findElement(ct.sign).click();	
	}
	
}
