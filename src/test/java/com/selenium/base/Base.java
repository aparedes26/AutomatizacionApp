package com.selenium.base;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class Base {

	
	protected static AppiumDriver<MobileElement> driverAppium;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName", "RF8N804LFZZ");
			
	cap.setCapability("platformName", "Android");
	
	cap.setCapability("platformVersion", "10.0.0");
	
	cap.setCapability("appPackage", "cl.sodimac"); //
	
	cap.setCapability("appActivity", "cl.sodimac.SplashScreenActivity");  
	
	driverAppium= new AppiumDriver<MobileElement>(cap);
	
	//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);  
	
	driverAppium.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
	

   
		
	
	}
		

}
