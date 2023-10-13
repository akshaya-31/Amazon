package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class AddToCart extends WebTestBase {

	@FindBy(id = "twotabsearchtextbox" )
	WebElement search_items;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement search_btn;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a")
	WebElement idol;
	
	@FindBy(id= "add-to-cart-button" )
	WebElement cart;
	
	@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/span" )
	WebElement message;
	
	public AddToCart()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searching() throws InterruptedException
	{
		search_items.click();
		search_items.sendKeys("idols");
		search_btn.click();
		Utility.scrollingdown(driver, idol);
		idol.click();
		Thread.sleep(2000);
		Utility.switchTowindows(driver, cart);
		Thread.sleep(2000);
		//Utility.switchTowindows(driver);
	}
	
	public String getMessage()
	{
		return message.getText();
	}
}