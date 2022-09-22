package com.unosquare.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class aboutme_Test extends AbstractBaseTest {
	@Test(groups= {"TCMenuFlow"})
	public void aboutMeMenu_TestCase() throws Exception {
		Thread.sleep(5000);
		App().Pages().AboutMePage().clickAboutMeMenuOption();
		
		if (App().Flow().elementIsPresent(App().Pages().AboutMePage().aboutMeTitleLocator(), 5)) {
			Assert.assertEquals(App().Flow().getCurrentPageTitle(), "About Me", "Verify that Title header is correct in About Me page");
			Assert.assertEquals(App().Pages().AboutMePage().aboutMeTitleLocator().getText(), "About Me", "Verify that Title element is correct in About Me page");
		}else{
			System.out.println("About Me page not loaded");
		}
	}
}
