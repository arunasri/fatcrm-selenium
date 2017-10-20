package CreatePagePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.core.pageobjects.BasePageObjects;

public class CreateLeads extends BasePageObjects {
        public CreateLeads(WebDriver driver) {
        	super(driver);
        }
        
      //Create Lead 
    	
    	@FindBy(how = How.ID, using = "lead_first_name")
    	public WebElement firstNameTextBox;
    	
    	@FindBy(how = How.ID, using = "lead_last_name")
    	public WebElement lastNameTextBox;
    	
    	@FindBy(how = How.ID, using = "lead_email")
    	public WebElement emailTextBox;
    	
    	@FindBy(how = How.ID, using = "lead_phone")
    	public WebElement phoneTextBox;
    	
    	//Status dropdown
    	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Status")
    	public WebElement statusDropdownOption;
    	
    	@FindBy(how = How.ID, using = "select2-lead_assigned_to-container")
    	public WebElement assignedToDropdownLink;
    	
    	@FindBy(how = How.ID, using = "lead_status")
    	public WebElement statusDropdownLink;
    	
    	@FindBy(how = How.ID, using = "lead_rating")
    	public WebElement ratingDropdownLink;
    	
    	@FindBy(how = How.ID, using = "lead_source")
    	public WebElement sourceDropdownLink;
    	
    	@FindBy(how = How.ID, using = "lead_campaign_id")
    	public WebElement campaignDropdownLink;
    	
    	//Contact Information
    	@FindBy(how = How.ID, using = "lead_title")
    	public WebElement titleTextField;
    	@FindBy(how = How.ID, using = "lead_company")
    	public WebElement companyTextField;
    	@FindBy(how = How.ID, using = "lead_alt_email")
    	public WebElement alternativeEmailTextField;
    	@FindBy(how = How.ID, using = "lead_mobile")
    	public WebElement mobileTextField;
    	@FindBy(how = How.ID, using = "lead_business_address_attributes_street1")
    	public WebElement addressTextField1;
    	@FindBy(how = How.ID, using = "lead_business_address_attributes_street2")
    	public WebElement addressTextField2;
    	@FindBy(how = How.ID, using = "lead_business_address_attributes_city")
    	public WebElement cityTextField;
    	@FindBy(how = How.ID, using = "lead_business_address_attributes_state")
    	public WebElement stateTextField;
    	@FindBy(how = How.ID, using = "lead_business_address_attributes_zipcode")
    	public WebElement zipcodeTextField;
    	@FindBy(how = How.ID, using = "select2-lead_business_address_attributes_country-container")
    	public WebElement countryDropdown;
    	@FindBy(how = How.ID, using = "lead_referred_by")
    	public WebElement refferedByTextField;
    	@FindBy(how = How.ID, using = "lead_do_not_call")
    	public WebElement doNotCallCheckbox;
    	
    	//Comment
    	@FindBy(how = How.ID, using = "comment_body")
    	public WebElement commentTextField;
    	
    	//Web Presence  
    	@FindBy(how = How.ID, using = "lead_blog")
    	public WebElement websiteBlogTextField;
    	@FindBy(how = How.ID, using = "lead_twitter")
    	public WebElement twitterTextField;
    	@FindBy(how = How.ID, using = "lead_linkedin")
    	public WebElement linkedInTextField;
    	@FindBy(how = How.ID, using = "lead_facebook")
    	public WebElement facebookTextField;
    	@FindBy(how = How.ID, using = "lead_skype")
    	public WebElement skypeTextField;
    	
    	// Extra
    	@FindBy(how = How.ID, using = "lead_cf_team")
    	public WebElement teamTextField1;
    	@FindBy(how = How.ID, using = "lead_cf_team_2")
    	public WebElement teamTextField2;
    	
    	//Permissions
    	@FindBy(how = How.ID, using = "lead_access_private")
    	public WebElement checkBox1;
    	@FindBy(how = How.ID, using = "lead_access_public")
    	public WebElement checkBox2;
    	@FindBy(how = How.ID, using = "lead_access_shared")
    	public WebElement checkBox3;
    	@FindBy(how = How.ID, using = "lead_access_campaign")
    	public WebElement checkBox4;
    	
    	//Create Lead Button
    	@FindBy(how = How.NAME, using = "commit")
    	public WebElement createLeadButton;
    	
    	//Cancel Link
    	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Cancel")
    	public WebElement cancelLink;
    	
}
