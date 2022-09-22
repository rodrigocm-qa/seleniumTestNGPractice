package com.unosquare.tests;

import org.testng.annotations.Test;

import org.testng.annotations.*;
import org.testng.Assert;

public class login_Test extends AbstractBaseTest { // Adding the "extends" in order to inherit the parent methods
	// WebDriver driver; //moved to BaseTest class
	// login_Page loginPage; //moved to BaseTest class

	@BeforeClass // moved to BaseTest class, we can still having here in case this specific class
					// needs it
	@AfterClass // moved to BaseTest class, we can still having here in case this specific class
				// needs it

	@Test(groups= {"TCMenuFlow"})
	public void login_TitleIsOk() {
		// App().Flow().navigateToUrl("https://www.test.com/"); // In case we need to
		// navigate to specific URL, but now it is in the AbstractBaseTest
		String expectedTitle = "Sign in to your account";
		String currentTitle = App().Flow().getCurrentPageTitle(); // getting Header Title
		Assert.assertEquals(currentTitle, expectedTitle, "Verify Title of Login screen");
	}

	@Test (groups= {"TCMenuFlow"})
	public void loginFlow_TestCase() {
		boolean staySigned = true;
		// Login
		if (App().Flow().elementIsPresent(App().Pages().LoginPage().signInTitleLocator(), 5)) {
			App().Pages().LoginPage().typeEmail("YourEmail");
			App().Pages().LoginPage().clickNextButton();
			if (App().Flow().elementIsPresent(App().Pages().LoginPage().pswTitleLocator(), 5)) {
				App().Pages().LoginPage().typePassword("YourPass");
				App().Pages().LoginPage().clickSignIn();
			}
		} else {
			System.out.println("Login page not loaded");
		}

		// StaySignedIn
		if (App().Flow().elementIsPresent(App().Pages().LoginPage().staySignInTitleLocator(), 5)) {
			if (staySigned) {
				App().Pages().LoginPage().clickYesBtn();
			}else {
				App().Pages().LoginPage().clickNoBtn();
			}
		}else {
			System.out.println("Stay signed in page not loaded");
		}
		Assert.assertEquals(App().Flow().getCurrentPageTitle(), "Intranet - Homepage", "Verify that Login Succed and title is from Intranet");
	}
	
	
}
