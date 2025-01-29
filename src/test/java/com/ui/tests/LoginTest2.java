package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.LoginPage;
import com.ui.pages.homePage;
import com.utility.BrowserUtility;

public class LoginTest2 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //launch the application 
		homePage home = new homePage(wd);
		LoginPage loginPage = home.goToLoginPage();
		
		loginPage.doLoginWith("yopije6932@kurbieh.com", "Akshay@1806");
	}

}
