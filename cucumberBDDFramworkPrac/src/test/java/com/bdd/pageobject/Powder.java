package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;

public class Powder extends BaseCases{

          ContactusStore ct = new ContactusStore();
	
	      public void cpowder(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(ct.clickonPowder).click();

	}

}


