package com.core.tests;

import org.openqa.selenium.WebDriver;

import com.core.pageobjects.LoginpagePO;

public class BaseIT {
	public void signIn(WebDriver driver, String userName, String passwd){
		LoginpagePO loginPage = new LoginpagePO(driver);
		loginPage.signIn(userName, passwd);
	}
	
}
