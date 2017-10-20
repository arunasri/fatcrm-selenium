package CreatePagePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.core.pageobjects.BasePageObjects;

public class CreateAccounts extends BasePageObjects {
	public CreateAccounts(WebDriver driver) {
		super(driver);
	}
	
	// Create account page fields
	   @FindBy(how = How.ID, using = "account_name")
	   public WebElement nameTextField;
	   @FindBy(how = How.ID, using = "select2-account_assigned_to-container")
	   public WebElement assignedTo;
	   @FindBy(how = How.ID, using = "account_category")
	   public WebElement category;
	   @FindBy(how = How.ID, using = "account_rating")
	   public WebElement rating;
	   //Tags
	   
	   //Comments
	   @FindBy(how = How.ID, using = "comment_body")
	   public WebElement comment;
	   
	   //Contact Information
	   @FindBy(how = How.ID, using = "account_toll_free_phone")
	   public WebElement tollFree;
	   @FindBy(how = How.ID, using = "account_phone")
	   public WebElement phone;
	   @FindBy(how = How.ID, using = "account_fax")
	   public WebElement fax;
	   @FindBy(how = How.ID, using = "account_website")
	   public WebElement website;
	   @FindBy(how = How.ID, using = "account_email")
	   public WebElement email;
	   
	   // billing Address
	   @FindBy(how = How.ID, using = "account_billing_address_attributes_street2")
	   public WebElement billingAddress1;
	   @FindBy(how = How.ID, using = "account_billing_address_attributes_street2")
	   public WebElement billingAddress2;
	   @FindBy(how = How.ID, using = "account_billing_address_attributes_city")
	   public WebElement billingCity;
	   @FindBy(how = How.ID, using = "account_billing_address_attributes_state")
	   public WebElement billingState;
	   @FindBy(how = How.ID, using = "account_billing_address_attributes_zipcode")
	   public WebElement billingZipcode;
	   @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Select a Country")
	   public WebElement billingCountry;
	   
	   //Shipping Address
	   @FindBy(how = How.ID, using = "account_shipping_address_attributes_street1")
	   public WebElement shippingAddress1;
	   @FindBy(how = How.ID, using = "account_shipping_address_attributes_street2")
	   public WebElement shippingAddress2;
	   @FindBy(how = How.ID, using = "account_shipping_address_attributes_city")
	   public WebElement shippingCity;
	   @FindBy(how = How.ID, using = "account_shipping_address_attributes_state")
	   public WebElement ShippingState;
	   @FindBy(how = How.ID, using = "account_shipping_address_attributes_zipcode")
	   public WebElement ShippingZipcode;
	   @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Select a Country")
	   public WebElement shippingCountry;
	   
	   // same as billing address link
	   @FindBy(how = How.ID, using = "same as billing")
	   public WebElement sameAsBillingLink;
	   
	   // Chinese Text
	   @FindBy(how = How.ID, using = "account_cf___2")
	   public WebElement account2;
	   @FindBy(how = How.ID, using = "account_cf___3")
	   public WebElement account3;
	   @FindBy(how = How.ID, using = "account_cf___4")
	   public WebElement account4;
	   @FindBy(how = How.ID, using = "account_cf___5")
	   public WebElement account5;
	   
	   // Permissions Radio Buttons
	   @FindBy(how = How.ID, using = "account_access_private")
	   public WebElement privateRadioButton; 
	   @FindBy(how = How.ID, using = "account_access_public")
	   public WebElement publicRadioButton;
	   @FindBy(how = How.ID, using = "account_access_shared")
	   public WebElement sharedRadioButton;
    
	   //Create Account Button
	   @FindBy(how = How.ID, using = "commit")
	   public WebElement createAccountButton;
	   @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Cancel")
	   public WebElement cancelLink;
}
