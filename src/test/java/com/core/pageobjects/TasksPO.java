package com.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TasksPO extends BasePageObjects {
	public TasksPO(WebDriver driver) {
		super(driver);
	}
	
	//Tasks title heading
	@FindBy(how = How.ID, using = "/title")
	public WebElement tasksTitle;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "//a[contains(text()='Create Task')]")
	public WebElement createTask;
	
	

}
