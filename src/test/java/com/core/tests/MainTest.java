package com.core.tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.core.pageobjects.AccountsPO;
import com.core.pageobjects.CampaignsPO;
import com.core.pageobjects.HomePagePO;

import CreatePagePO.CreateCampaigns;

public class MainTest extends BaseIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
		driver = new ChromeDriver();
		// driver = new RemoteWebDriver(new
		// URL("http://35.193.227.180:4444/wd/hub"),
		// DesiredCapabilities.chrome());
		baseUrl = "http://demo.fatfreecrm.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// i am on accounts page
	// search for novocall
	// verify resutls contain novocall
	//@Test
	public void testAccountsSearch() throws Exception {
		// preconditions
		driver.get(baseUrl + "/login");
		signIn(driver, "heather", "heather");

		// testcase 1
		// Click on Accounts Tab
		HomePagePO home = new HomePagePO(driver);
		home.accountsTab.click();
		System.out.println("Accounts tab is clicked");
		// Search for novocall
		AccountsPO novocall = new AccountsPO(driver);
		novocall.basicSearch.sendKeys("novocall");
		System.out.println("Searched for novocall");
		// verify novocall search results displayed
		WebElement novocallresults = driver.findElement(By.partialLinkText("Novocall"));
		System.out.println("Novocall results displayed successfully");
	}
	
	
    @Test
	public void testCreateCampaigns() throws Exception {
		// precondition
		driver.get(baseUrl + "/login");
		signIn(driver, "heather", "heather");
		

		// testcase 2
		// Click on Campaigns Tab
		HomePagePO home = new HomePagePO(driver);
		home.campaignsTab.click();
		System.out.println("Campaigns tab is clicked");
		// Click on create Campaigns link
		CampaignsPO campaigns = new CampaignsPO(driver);
		campaigns.createCampaignLink.click();
		// Enter all the required fields in campaigns page
		CreateCampaigns create = new CreateCampaigns(driver);
		create.campaignName.sendKeys("ABCDEE");
		this.screenshot(driver,"campaigns", "campaign_name.png");
		create.startDate.sendKeys("2017-10-20");
		this.screenshot(driver,"campaigns","campaign_start.png");
		create.endDate.sendKeys("2017-10-23");
		this.screenshot(driver, "campaigns","campaign_end.png");
		create.status.sendKeys("Started");
		this.screenshot(driver, "campaigns","campaign_status.png");
		System.out.println("Name start End Status created");
		//comments
		create.commentLink.click();
		create.commentTextField.sendKeys("Test");
		System.out.println("comment created");
		// objectives
		create.objectivesLink.click();
		create.obj_NumberOfLeads_TextField.sendKeys("5");
		create.obj_Conversion_TextField.sendKeys("5");
		create.obj_Revenue_TextField.sendKeys("5");
		create.obj_Budget_TextField.sendKeys("5");
		create.obj_objectives_TextField.click();
		create.obj_objectives_TextField.sendKeys("ABCDE Test");		
		System.out.println("objective created");
		//Permissions
		create.permissionsLink.click();
		create.privateRadioButton1.click();
		System.out.println("private radio button clicked");
		//create button
		create.createCampaignButton.click();
		WebElement campaignsCreated = driver.findElement(By.id("campaigns"));
		Assert.assertEquals(true, campaignsCreated.isDisplayed());
		System.out.println("ABCDE created");	
		this.screenshot(driver,"campaigns", "campaign_created.png");
		System.out.println("screenshot Taken");
	}

	@AfterMethod
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}
}
