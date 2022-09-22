package com.unosquare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.unosquare.elements.aboutmePage_Elements;

public class aboutme_Page {
	WebDriver driver;
	aboutmePage_Elements aboutmePageElements;

	public aboutme_Page(WebDriver driver) {
		this.driver = driver;
		aboutmePageElements = new aboutmePage_Elements(driver);
	}
	
	//Methods/Actions
	public void clickAboutMeMenuOption()
    {
		aboutmePageElements.aboutMeMenuLocator.click();
    }
	
	public WebElement aboutMeTitleLocator() {
    	return aboutmePageElements.titleLocator;
    }

}
