package com.unosquare.lib;

import org.openqa.selenium.WebDriver;

import com.unosquare.pages.aboutme_Page;
import com.unosquare.pages.login_Page;

public class PageLib { //Page Library: Contains all the pages, that way we can initialize them in one place
	
	private WebDriver driver;			// Declaring the driver instance
	private login_Page loginPage;		// Declaring the login_Page instance as private
	private aboutme_Page aboutmePage;
	// Here declaring more pages in case is needed
	
	public PageLib(WebDriver driver) { 		//Constructor that will initialize all the pages
		this.driver=driver;
		loginPage = new login_Page(this.driver);				//Instantiating login_Page
		aboutmePage = new aboutme_Page(this.driver);
		// Here more page initializations in case is needed
	}
	
	//As objects are private, we need the getter methods
	
	public login_Page LoginPage() {
		return loginPage;
	}
	
	public aboutme_Page AboutMePage() {
		return aboutmePage;
	}
	

}
