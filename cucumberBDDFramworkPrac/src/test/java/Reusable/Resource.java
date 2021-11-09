package Reusable;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.bdd.utility.ReadConfig;

public class Resource {
 
ReadConfig rf = new ReadConfig();
	
	
	
	public String browserURL = rf.getURL();
	public String chromepath = rf.chromepath();
	public String google = rf.getchrome();
	protected static WebDriver driver;
	public static Logger logger;
	
}
