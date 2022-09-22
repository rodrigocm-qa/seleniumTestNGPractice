package com.unosquare.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlowLib { // Hold all the repeatable methods/actions in tests
	private WebDriver driver;

	public FlowLib(WebDriver driver) { // Class Constructor that receives the driver
		this.driver = driver;
	}

	// Wrapper methods and/or Helper methods
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}

	public void maximize() {
		this.driver.manage().window().maximize();
	}

	public String getCurrentPageUrl() {
		return this.driver.getCurrentUrl();		
	}

	public String getCurrentPageTitle() {
		return this.driver.getTitle();			 //Getting Header Title
	}

	// Helpers methods
	public boolean elementIsPresent(WebElement locator, int seconds) {
		try {
			// explicit wait
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(locator));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

}
