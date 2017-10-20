package CreatePagePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.core.pageobjects.BasePageObjects;

public class CreateTasks extends BasePageObjects {
	public CreateTasks(WebDriver driver) {
		super(driver);
	}
	
	//Create task options
	
	@FindBy(how = How.ID, using = "task_name")
	public WebElement taskName;
	
	@FindBy(how = How.ID, using = "task_bucket")
	public WebElement due;	
	
	@FindBy(how = How.ID, using = "select2-task_assigned_to-container")
	public WebElement assignTo;
	
	@FindBy(how = How.ID, using = "task_category")
	public WebElement category;
	
	@FindBy(how = How.NAME, using = "commit")
	public WebElement createTaskButton;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Cancel")
	public WebElement cancelLink;

}
