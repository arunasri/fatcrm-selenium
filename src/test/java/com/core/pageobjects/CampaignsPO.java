package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CampaignsPO extends BasePageObjects {
	public CampaignsPO(WebDriver driver) {
		super(driver);
	}
	
	
	// campaign title
	@FindBy(how = How.ID, using = "create_campaign_title")
	public WebElement campaigeTitle;
	// create campaign link
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Create Campaign")
	public WebElement createCampaignLink;	
	// Format link
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Brief format']")
	public WebElement briefFormatLink;
	// format link
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Long format']")
	public WebElement longFormatLink;
	//TABS
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Basic search")
	public WebElement basicSearchTab;	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Advanced search")
	public WebElement advancedSearchTab;
	
	@FindBy(how = How.ID, using = "query")
	public WebElement searchCampaignBox;
	
	@FindBy(how = How.ID, using = "sort_by")
	public WebElement sortByDateCreatedLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Campaign Statuses']")
	public WebElement campaignStatuses;

}
