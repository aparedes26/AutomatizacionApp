package Test;


import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import Page.SeleccionZona;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


class SeleccionZona_Test {
	
	 static AppiumDriver<MobileElement> driverAppium;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "RF8N804LFZZ");
				
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion", "10.0.0");
		
		cap.setCapability("appPackage", "cl.sodimac"); //
		
		cap.setCapability("appActivity", "cl.sodimac.SplashScreenActivity");
		
		driverAppium= new AppiumDriver<MobileElement>(cap);
		
		//AndroidDriver<AndroidElement> driverAppium = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);  
		
		driverAppium.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		
		SeleccionZona select = new SeleccionZona(driverAppium);
		select.SelectZone();
		
		
	}

}
