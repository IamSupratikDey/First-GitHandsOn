package com.bdd.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Reusable.BaseCases;
import Reusable.Resource;






public class TakeScreenShot extends Resource{

	public static  void takeSnapShotonpass(String tr) throws IOException{
		
		 Date currentdate = new Date();
	     
	     File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshots//"+tr+".png"));
		} catch (IOException e) {
			
			System.out.println("SS file not found");
		}
		 
		}
	
	public static  void takeSnapShotonFail(String tr) throws IOException{
		
		 Date currentdate = new Date();
	     
	     File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshots1//"+tr+".png"));
		} catch (IOException e) {
			
			System.out.println("SS file not found");
		}
		 
		}

	 

	
	}

	



