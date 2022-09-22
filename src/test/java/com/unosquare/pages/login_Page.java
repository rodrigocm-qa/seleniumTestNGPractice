package com.unosquare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.unosquare.elements.loginPage_Elements;

public class login_Page {
	WebDriver driver;
	loginPage_Elements loginPageElements;

	//Creating Constructor, so when we instance login_Page it will also instantiate loginPage_Elements to initialize the PageFactoryElements 
	public login_Page(WebDriver driver) {
		this.driver = driver;
		loginPageElements = new loginPage_Elements(driver);
	}
	
	//Methods/Actions
	
		public void typeEmail(String email)
	    {
			loginPageElements.emailTxt.sendKeys(email);
	    }

	    public void clickNextButton()
	    {
	    	loginPageElements.nextBtn.click();
	    }
	    
	    public void typePassword(String password)
	    {
	    	loginPageElements.pswTxt.sendKeys(password);
	    }   
	    
	    public WebElement signInTitleLocator() {
	    	return loginPageElements.signInTitleLocator;
	    }
	    
	    public WebElement pswTitleLocator() {
	    	return loginPageElements.pswTitleLocator;
	    }
	    
	    public WebElement staySignInTitleLocator() {
	    	return loginPageElements.staySignInTitleLocator;
	    }
	    
	    public void clickSignIn()
	    {
	    	loginPageElements.signInBtn.click();
	    }
	    
	    public void clickYesBtn()
	    {
	    	loginPageElements.yesBtn.click();
	    }
	    
	    public void clickNoBtn()
	    {
	    	loginPageElements.noBtn.click();
	    }

}
