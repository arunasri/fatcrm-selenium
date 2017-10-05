package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPO {
	
	@FindBy(how = How.LINK_TEXT, using = "Forgot Password?")
	public WebElement forgotPassword;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement email;
	
	@FindBy(how = How.ID, using = "passwords_submit")
	public WebElement resetButton;
	
	public WebDriver driver;
	public ForgotPasswordPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
