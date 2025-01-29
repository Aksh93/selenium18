package com.ui.tests;

import static com.constants.Browser.EDGE;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.homePage;
import com.ui.pojo.User;

public class LoginTestOLD {
	homePage home;
	
	@BeforeMethod(description = "load th homepage of website")
	public void setup() {
	home = new homePage(EDGE);
	}
	
	@Test(description="verifies login", dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider", 
			retryAnalyzer= com.ui.listeners.MyRetryAnalyzer.class )
	public void loginTest(User user) {
		assertEquals(home.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Asd as");
	}
}
