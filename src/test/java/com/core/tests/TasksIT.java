package com.core.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.core.pageobjects.TasksPO;

public class TasksIT extends BaseIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://demo.fatfreecrm.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signIn(driver, "heather", "heather");
	}	
	
	
	public void testCreateTask() throws Exception {
		driver.get(baseUrl + "/login");
		TasksPO task = new TasksPO(driver);
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
