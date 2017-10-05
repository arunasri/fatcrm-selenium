package com.core.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePO {
	
	@FindBy(how = How.ID, using = "authentication_username")
	public WebElement username;
	
	@FindBy(how = How .ID, using = "authentication_password")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "commit")
	public WebElement loginButton;
	
	
	public WebDriver driver;
	public LoginpagePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

