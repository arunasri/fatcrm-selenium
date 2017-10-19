package com.core.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.core.pageobjects.ForgotPasswordPO;

public class ForgotPasswordIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
	    driver = new ChromeDriver();
	    baseUrl = "http://demo.fatfreecrm.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public void testForgotPassword() throws Exception {
		driver.get(baseUrl + "/login");
		ForgotPasswordPO forgotpassword = new ForgotPasswordPO(driver);
		forgotpassword.forgotPassword.click();
		forgotpassword.email.sendKeys("abc@gmail.com");
		forgotpassword.resetButton.click();
	}
	
	
	@AfterMethod
	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {			
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      Assert.fail(verificationErrorString);
	    }
	}
}
	
