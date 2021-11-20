package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;

   public class CartItem extends Resource {

	   
	   
	   ContactusStore ct = new ContactusStore();
	
	 public void shp(WebDriver driver) throws InterruptedException 
	 {
		 
	    Actions a=new Actions(driver);
	    a.moveToElement(driver.findElement(ct.ShopByCategory)).build().perform();
		Thread.sleep(3000);
	 }
}
