package com.pmagy.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pmagy.base.TestBase;

public class LoginTest extends TestBase {
	
	
	@Test
	public void Test() throws InterruptedException {
		
		driver.findElement(By.id(OR.getProperty("id"))).sendKeys(config.getProperty("id"));
		driver.findElement(By.id(OR.getProperty("password"))).sendKeys(config.getProperty("password"));
		Thread.sleep(15000);
		driver.findElement(By.id(OR.getProperty("submit"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("user"))), "Login not successful!");
		
	}
}
