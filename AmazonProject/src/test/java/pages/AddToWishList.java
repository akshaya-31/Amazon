package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class AddToWishList extends WebTestBase {

	@FindBy(id = "twotabsearchtextbox" )
	WebElement search_items;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement search_btn;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[3]/div[1]/h2/a")
	WebElement plant;
	
	@FindBy(id = "add-to-wishlist-button-submit")
	WebElement wishlist_btn;
	
	@FindBy(xpath = "//a[text()='View Your List']")
	WebElement view;
	
	@FindBy(id = "profile-list-name")
	WebElement message;
	
	public AddToWishList()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void wishList() throws InterruptedException
	{
		search_items.click();
		search_items.sendKeys("plants");
		search_btn.click();
		Thread.sleep(2000);
		plant.click();
		Utility.switchTowindows(driver, wishlist_btn);
		view.click();
	}
	
	public String getMessage()
	{
		return message.getText();
	}
}