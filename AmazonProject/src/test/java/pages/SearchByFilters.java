package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

import utils.Utility;

public class SearchByFilters extends WebTestBase {

	@FindBy(id = "twotabsearchtextbox" )
	WebElement search_items;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement search_btn;
	
	@FindBy(xpath = "//span[text()='realme']")
	WebElement samsung;
	
	@FindBy(xpath = "//span[text()='64 GB']")
	WebElement memory;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/span[2]/div/h1/div/div[1]/div/div/span[3]")
	WebElement message;
	
	public SearchByFilters()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searching() throws InterruptedException
	{
		search_items.click();
		search_items.sendKeys("mobiles");
		search_btn.click();
		samsung.click();
		Thread.sleep(2000);
		Utility.scrollingdown(driver, memory);
		memory.click();
	}
	
	public String getMessage()
	{
		return message.getText();
	}
}