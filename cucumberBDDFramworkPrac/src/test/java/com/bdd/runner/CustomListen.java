package com.bdd.runner;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;



	public  class CustomListen  extends Resource implements ITestListener {
		
		
		BaseCases bs = new BaseCases();
		TakeScreenShot ts = new TakeScreenShot();
		
	  public void onTestStart(ITestResult tr)
	  {
		  System.out.println("Test has started");
	  }
	  
	  
	  
	  
	  
	  public void onTestSuccess(ITestResult tr)
	  {
		  System.out.println("Test passed");
		  try {
			 ts.takeSnapShotonpass(tr.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  

	

	public void onTestFailure(ITestResult tr)
	  {
		  System.out.println("Test Failed");
		  try {
			ts.takeSnapShotonFail(tr.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	  }
	  
	
	
	
	
	  public void onTestSkipped(ITestResult tr)
	  {
		  System.out.println("Test Skipped");
	  }





	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}





	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}





	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	}

	
	

