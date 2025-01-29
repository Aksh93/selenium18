package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.PropertiesUtil;

public final class homePage extends BrowserUtility {

	public homePage(Browser string) {
		super(string);
		goToWebsite(PropertiesUtil.readProperty(QA, "URL"));
	}

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(), 'Sign in')]");
	
	public LoginPage goToLoginPage() {   ///page functions...>
		clickon(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}
