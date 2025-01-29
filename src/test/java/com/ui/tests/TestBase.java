package com.ui.tests;

import static com.constants.Browser.EDGE;

import org.testng.annotations.BeforeMethod;

import com.ui.pages.homePage;
import com.utility.BrowserUtility;

public class TestBase {
	protected homePage home;
	
	@BeforeMethod(description = "load th homepage of website")
	public void setup() {
	home = new homePage(EDGE);
	
}
	
	public BrowserUtility getInstance() {
	
		return home;
}
}