package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountsPO extends BasePageObjects {
	public AccountsPO(WebDriver driver) {
		super(driver);
	}
	
    // Accounts title heading
	@FindBy(how = How.ID, using = "create_account_title")
	public WebElement accountsTitle;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Basic search")
	public WebElement basicSearch;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Advanced search")
	public WebElement AdvanceSearch;
	@FindBy(how = How.ID, using = "query")
	public WebElement searchAccountsTextBox;
	@FindBy(how = How.ID, using = "sort_by")
	public WebElement sortBy;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Create Account")
	public WebElement createAccountLink;
}
