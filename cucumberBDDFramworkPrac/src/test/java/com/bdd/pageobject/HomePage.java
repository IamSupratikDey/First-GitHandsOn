package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import Reusable.Resource;



public class HomePage extends Resource {

	public void OpenBrowser(WebDriver driver)
	{
		driver.get(browserURL);
		driver.manage().window().maximize();
	}
	
	
}
