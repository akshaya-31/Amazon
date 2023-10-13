package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class SearchByCategories extends WebTestBase {
	
	@FindBy(id = "nav-hamburger-menu")
	WebElement all;
	
	@FindBy(xpath= "/html/body/div[3]/div[2]/div/ul[1]/li[18]/a")
	WebElement womens_fashion;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul[11]/li[10]/a")
	WebElement watches;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option[1]")
	WebElement message;
	
	public SearchByCategories()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search_bycategories() throws InterruptedException
	{
		all.click();
		Thread.sleep(2000);
		Utility.scrollingdown(driver, womens_fashion);
		Thread.sleep(2000);
		womens_fashion.click();
		Thread.sleep(2000);
		Utility.scrollingdown(driver, watches);
		Thread.sleep(2000);
		watches.click();
		Thread.sleep(2000);
	}
	public String getMessage()
	{
		return message.getText();
	}
}