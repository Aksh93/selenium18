package study;

import test.test.ChromeDriver;
import test.test.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMPLICIT {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Wait<WebDriver> fluWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
				 .withTimeout(Duration.ofSeconds(30))
			  .pollingEvery(Duration.ofSeconds(5))
			 .ignoring(NoSuchElementException.class);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.google.com/");
		
		//Thread.sleep(10);
		
		//driver.findElement(By.xpath("//a[text()=\'About\']")).click();	
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\'About\']")));
		
		fluWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\'About\']")));
		
	}
}
