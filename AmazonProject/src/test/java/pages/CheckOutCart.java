package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class CheckOutCart extends WebTestBase {

	@FindBy(id="nav-cart")
	WebElement cart_btn;
	
	@FindBy(xpath = "//input[@Name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/form/div/div[2]/div/span/span/input")
	WebElement address;
	
	@FindBy(xpath= "//h3[text()='Order Summary']")
	WebElement message;
	
	public CheckOutCart()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkout() throws InterruptedException {
		cart_btn.click();
		proceed_to_buy.click();
		address.click();
		Thread.sleep(2000);
	}
	public String getMessage()
	{
		return message.getText();
	}
}
