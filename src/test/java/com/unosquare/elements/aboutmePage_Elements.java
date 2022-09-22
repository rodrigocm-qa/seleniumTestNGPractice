package com.unosquare.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aboutmePage_Elements {
	
		WebDriver driver;
		//locators
		@FindBy(css="div[class='fm_ak_9f38462c as_t_9f38462c u_t_9f38462c css-269'][title='About Me']") public WebElement titleLocator;
		@FindBy(css="a[href*='/sites/Intranet/SitePages/About-Me.aspx']") public WebElement aboutMeMenuLocator;
		
		//constructor
		public	aboutmePage_Elements(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver,this); 
		}

}


