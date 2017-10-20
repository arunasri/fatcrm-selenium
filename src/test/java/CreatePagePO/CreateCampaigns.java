package CreatePagePO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.core.pageobjects.BasePageObjects;

public class CreateCampaigns extends BasePageObjects {
	public CreateCampaigns(WebDriver driver) {
		super(driver);
	}
	
		// campaign name text filed
		@FindBy(how = How.NAME, using = "campaign[name]")
		public WebElement campaignName;
		// Start Date 
		@FindBy(how = How.NAME, using = "campaign[starts_on]")
		public WebElement startDate;
		// End Date
		@FindBy(how = How.NAME, using = "campaign[ends_on]")
		public WebElement endDate;
		// Status dropdown 
		@FindBy(how = How.NAME, using = "campaign[status]")
		public WebElement status;
		// Tags
		//@FindBy(how = How, using = "")
		//public WebElement ;
		
		// Comment Text Field
		@FindBy(how = How.ID, using = "comment_body")
		public WebElement commentTextField;
		
		// Objectives fields
		@FindBy(how = How.ID, using = "campaign_target_leads")
		public WebElement obj_NumberOfLeads_TextField;		
		@FindBy(how = How.ID, using = "campaign_target_conversion")
		public WebElement obj_Conversion_TextField;		
		@FindBy(how = How.ID, using = "campaign_target_revenue")
		public WebElement obj_Revenue_TextField;		
		@FindBy(how = How.ID, using = "campaign_budget")
		public WebElement obj_Budget_TextField;		
		@FindBy(how = How.ID, using = "campaign_objectives")
		public WebElement obj_objectives_TextField;	
		
		// Permissions Radio buttons
		@FindBy(how = How.ID, using = "campaign_access_private")
		public WebElement privateRadioButton1;		
		@FindBy(how = How.ID, using = "campaign_access_public")
		public WebElement publicRadioButton2;
		@FindBy(how = How.ID, using = "campaign_access_shared")
		public WebElement sharedRadioButton3;
		
		// Create Campaign button
		@FindBy(how = How.NAME, using = "commit")
		public WebElement createCampaignButton;
		
		// Cancel Link
		@FindBy(how = How.PARTIAL_LINK_TEXT,  using = "Cancel")
		public WebElement cancelLink;
		
}
