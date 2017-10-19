package com.core.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.core.pageobjects.CampaignsPO;
import com.core.pageobjects.LoginpagePO;

public class CampaignsIT {
	private WebDriver  driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
		driver = new ChromeDriver();
		//driver = new RemoteWebDriver(new URL("http://35.193.227.180:4444/wd/hub"), DesiredCapabilities.chrome());
		baseUrl = "http://demo.fatfreecrm.com";
		driver.get(baseUrl + "/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginpagePO login = new LoginpagePO(driver);
		login.username.sendKeys("heather");
		login.password.sendKeys("heather");
		login.loginButton.click();
	}
	
	public void testCampaigns() throws Exception {
		
		
//		CampaignsPO campaign = new CampaignsPO(driver);
//		campaign.
//		campaign.username.sendKeys("heather");
//		campaign.password.clear();
//		campaign.password.sendKeys("heather");
//		campaign.loginButton.click();
//		System.out.println(driver.getTitle());
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
