package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;
public class WhatsNew extends Resource{
     
	ContactusStore ct = new ContactusStore();
	
	public void clickonWhatsNew(WebDriver driver)
	{
		driver.navigate().to(browserURL);
		
	}
}
