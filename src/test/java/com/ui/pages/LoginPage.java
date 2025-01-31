package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {

	private static final By EMAIL_TEXT_BOX_LOCATOR = By.id("email"); /////ANYTHING WHICH IS FINAL WE NEED TO CALL WITH UPEERCASE
	private static final By PASS_TEXT_BOX_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SUBMIT_LOCATOR = By.id("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage doLoginWith(String emailAddress, String password) {
		enterText( EMAIL_TEXT_BOX_LOCATOR, emailAddress);
		enterText( PASS_TEXT_BOX_LOCATOR, password);
		clickon(SUBMIT_LOCATOR);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}
}
