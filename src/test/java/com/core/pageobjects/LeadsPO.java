package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeadsPO extends BasePageObjects {
	public LeadsPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "create_lead_title")
	public WebElement leadsTitle;
	
	@FindBy(how = How.ID, using = "Brief format")
	public WebElement briefFormatLink;
	
	@FindBy(how = How.ID, using = "Long format")
	public WebElement longFormatLink;
	
	@FindBy(how = How.ID, using = "create_lead_arrow")
	public WebElement createLeadLink;
	
	@FindBy(how = How.ID, using = "query")
	public WebElement searchLeadsTextBox;
	
	@FindBy(how = How.ID, using = "sort_by")
	public WebElement dateSortByoptionsLink;
	
	
}


