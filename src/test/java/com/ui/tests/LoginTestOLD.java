package com.ui.tests;

import static com.constants.Browser.EDGE;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.homePage;
import com.ui.pojo.User;

public class LoginTestOLD extends TestBase {
	homePage home;
	
	@Test(description="verifies login", dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider", 
			retryAnalyzer= com.ui.listeners.MyRetryAnalyzer.class )
	public void loginTest(User user) {
		assertEquals(home.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Asd as");
	}
}
