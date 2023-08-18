package com.pmagy.base;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
				
		driver.get("http://164.100.77.235/pmagy/new-dashboard/login");
		driver.findElement(By.id("txt_usrId")).sendKeys("up-jn-pmagy");
		driver.findElement(By.id("txt_usr_pwd")).sendKeys("P@m#g*y5");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Submit"))).click();
		
	}
	
}
