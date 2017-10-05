package com.core.tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.core.pageobjects.LoginpagePO;

@Test
public class LoginPageIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
		driver = new RemoteWebDriver(new URL("http://35.193.227.180:4444/wd/hub"), DesiredCapabilities.chrome());
		baseUrl = "http://demo.fatfreecrm.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void testLoginPage() throws Exception {
		driver.get(baseUrl + "/login");
		LoginpagePO fatfreeweb = new LoginpagePO(driver);
		fatfreeweb.username.clear();
		fatfreeweb.username.sendKeys("heather");
		fatfreeweb.password.clear();
		fatfreeweb.password.sendKeys("heather");
		fatfreeweb.loginButton.click();
		System.out.println(driver.getTitle());
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
