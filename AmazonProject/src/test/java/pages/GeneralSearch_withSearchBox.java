package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class GeneralSearch_withSearchBox extends WebTestBase {
	
	@FindBy(id = "twotabsearchtextbox" )
	WebElement search_items;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement search_btn;
	
	@FindBy(xpath="//span[text()='\"water bottles\"']")
	WebElement message;
	
	public GeneralSearch_withSearchBox()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searching()
	{
		search_items.click();
		search_items.sendKeys("water bottles");
		search_btn.click();
	}

	public String getMessage() {
		return message.getText();
	}
}