package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO extends BasePageObjects {
	public HomePagePO(WebDriver driver) {
		super(driver);
	}

     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Dashboard")
     public WebElement dashboardTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Tasks")
     public WebElement tasksTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Campaigns")
     public WebElement campaignsTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Leads")
     public WebElement leadsTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Accounts")
     public WebElement accountsTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Contacts")
     public WebElement contactsTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Opportunities")
     public WebElement opportunitiesTab;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Team")
     public WebElement teamTab;
     
     @FindBy(how = How.LINK_TEXT, using = "Fat Free CRM")
     public WebElement fatFreeCRMLink;
     
     @FindBy(how = How.ID, using = "welcome_username")
     public WebElement welcomeUsernameLink;
     
     @FindBy(how = How.ID, using = "jumper")
     public WebElement quickFindLink;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Profile")
     public WebElement profileLink;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Admin")
     public WebElement adminLink;
     
     @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Logout")
     public WebElement logoutLink;
   
}



