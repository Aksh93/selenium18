package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //launch the application 
		
		BrowserUtility browserUtility = new BrowserUtility(wd);
		browserUtility.goToWebsite("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

		browserUtility.maximizewindow();
		
		By signInLinkLocator = By.xpath("//a[contains(text(), 'Sign in')]");
		browserUtility.clickon(signInLinkLocator);
		
		
		browserUtility.enterText(emailTextBoxLocator, "yopije6932@kurbieh.com" );
		
		
		browserUtility.enterText(passTextBoxLocator, "Akshay@1806" );
		
		
		browserUtility.clickon(submitLocator);
		
	}

}
