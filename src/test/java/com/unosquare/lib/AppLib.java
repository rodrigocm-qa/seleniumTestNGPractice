package com.unosquare.lib;

import org.openqa.selenium.WebDriver;

public class AppLib { //Application Library: Is the entry point to the hole application
	
	private WebDriver driver;			// Declaring the driver instance
	private PageLib pagelib;			// Declaring the Page Library instance as private
	private FlowLib flowlib;
	// Here declaring more pages in case is needed
	
	public AppLib(WebDriver driver) { 		//Constructor that will initialize all the pages
		this.driver=driver;
		pagelib = new PageLib(this.driver);		//Instantiating PageLib
		flowlib = new FlowLib(this.driver);
		// Here more page initializations in case is needed
	}
	
	//Getters for the instantiations
	public PageLib Pages() {
		return pagelib;
	}	
	
	public FlowLib Flow() {
		return flowlib;
	}

}
