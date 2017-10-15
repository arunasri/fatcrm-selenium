package com.core.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPO {
     @FindBy(how = How.ID, using = "Dashboard")
     public WebElement dashboardTab;
}
