package com.unosquare.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.unosquare.lib.AppLib;

public class AbstractBaseTest { // Base Class: To have all redundant methods in "Before", "After"
	WebDriver driver;			// Declaring the driver instance
	//login_Page loginPage;		// Declaring the login_Page instance			//Moved to Page Library
								// Here more page instances in case is needed
	
	//We are creating an object of an AppLib so we can call to the pages we moved to the Page library
	private AppLib app;
	
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://unosquare.sharepoint.com/");		//if url is different for each test case, then needs to be specified in eah test case
		Thread.sleep(2000);
		//loginPage = new login_Page(driver);					//Initializing login_Page	//Moved to Page Library
																// Here more page initializations in case is needed
		
		//We are instantiating the Application Library and we are passing the ChromeDriver to the hole app to be used in each constructor
		app = new AppLib(driver);
	}

	@AfterTest
	public void tearDown() {
		//driver.close();
	}
	
	
	//We are creating a getter so we can call the Application Library
	public AppLib App() {
		return app;
	}
	
}
