package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class BuyNow extends WebTestBase {

	@FindBy(id = "twotabsearchtextbox" )
	WebElement search_items;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement search_btn;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a")
	WebElement elephant_toy;
	
	@FindBy(id = "buy-now-button" )
	WebElement buy_now;
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/form/div/div[2]/div/span/span/input")
	WebElement address;
	
	@FindBy(id = "pp-rJU6EK-132")
	WebElement cod;
	
	@FindBy(xpath= "//h3[text()='Order Summary']")
	WebElement message;
	
	public BuyNow()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void buynow_dropdown() throws AWTException, InterruptedException
	{
		//Utility.dropdownsearch(driver,search_items);
		search_items.click();
		search_items.sendKeys("elephant toys");
		Utility.dropdownsearch();
		elephant_toy.click();
		Thread.sleep(1000);
		Utility.switchTowindows(driver, buy_now);
		address.click();
		Thread.sleep(2000);
	}
	public String getMessage()
	{
		return message.getText();
	}
}