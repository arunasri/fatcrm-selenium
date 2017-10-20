package com.core.tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.core.pageobjects.LoginpagePO;

public class BaseIT {
	public void signIn(WebDriver driver, String userName, String passwd) {
		LoginpagePO loginPage = new LoginpagePO(driver);
		loginPage.signIn(userName, passwd);
	}

	public void screenshot(WebDriver driver, String folder, String fileName) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshots/"+folder+"/" + fileName));
	}

}
