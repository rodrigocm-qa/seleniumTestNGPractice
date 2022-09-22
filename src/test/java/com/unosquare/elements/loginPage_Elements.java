package com.unosquare.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_Elements {
	
	//Declaring an instance of WebDriver
	WebDriver driver;
	
	//(A) Elements Page Factory
	@FindBy(xpath="//div[contains(text(),'Sign in')]") public WebElement signInTitleLocator;
	@FindBy(xpath="//input[@name='loginfmt']") public WebElement emailTxt;
	@FindBy(xpath="//input[@id='idSIButton9']") public WebElement nextBtn;
	@FindBy(xpath="//div[contains(text(),'Enter password')]") public WebElement pswTitleLocator;
	@FindBy(css="input[name='passwd']") public WebElement pswTxt;
	@FindBy(css="input#idSIButton9") public WebElement signInBtn;
	@FindBy(xpath="//div[contains(text(),'Stay signed in?')]") public WebElement staySignInTitleLocator;
	@FindBy(css="input#idBtn_Back") public WebElement noBtn;
	@FindBy(css="input#idSIButton9") public WebElement yesBtn;
	
	
	//Creating Constructor: It initializes the object
	public	loginPage_Elements(WebDriver driver) {
		//Whatever driver (Chrome, Mozzila) is passed by the user, it will be treated as the driver of this class to initialize above elements (A) 
		this.driver = driver; 
		//Initialize above elements (A)
		PageFactory.initElements(driver,this); //
	}
}
