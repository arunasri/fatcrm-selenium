package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TasksPO {
	
	@FindBy(how = How.ID, using = "authentication_username")
	public WebElement username;
	
	@FindBy(how = How.ID, using = "authentication_password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "commit")
	public WebElement login;
	
	@FindBy(how = How.LINK_TEXT, using = "/tasks")
	public WebElement tasksLink;
	
	@FindBy(how = How.LINK_TEXT, using = "/tasks/new?view=pending&cancel=false")
	public WebElement createTask;
	
	@FindBy(how = How.ID, using = "task_name")
	public WebElement taskName;
	
	@FindBy(how = How.ID, using = "task_bucket")
	public WebElement due;

	
	public WebDriver driver;
	public TasksPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
