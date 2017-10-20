package com.core.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePO extends BasePageObjects {
	public LoginpagePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "authentication_username")
	public WebElement username;
	
	@FindBy(how = How .ID, using = "authentication_password")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "commit")
	public WebElement loginButton;
	
	@FindBy(how =How.ID, using = "authentication_remember_me")
	public WebElement rememberMeCheckBox;
	
	@FindBy(how =How.PARTIAL_LINK_TEXT, using = "Forgot Password?")
	public WebElement forgotPasswordLink;
	
	public void signIn(String userNameValue, String passwdValue){
		this.username.clear();
		this.username.sendKeys(userNameValue);
		
		this.password.clear();
		this.password.sendKeys(passwdValue);
		
		this.loginButton.click();
	}
	
}

