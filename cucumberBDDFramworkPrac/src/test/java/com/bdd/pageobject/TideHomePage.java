package com.bdd.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Reusable.BaseCases;






public class TideHomePage extends BaseCases {
	
	public void clickonbrowserurl (WebDriver driver)
	{
		driver.get(browserURL);
	}
}


