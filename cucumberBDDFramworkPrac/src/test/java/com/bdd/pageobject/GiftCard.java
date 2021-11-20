package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;



public class GiftCard extends Resource {
      
	ContactusStore ct = new ContactusStore();
	
	 public void giftcard(WebDriver driver)
	 {
		 driver.navigate().to(browserURL);
		 driver.findElement(ct.giftcard).click();
	 }
}
