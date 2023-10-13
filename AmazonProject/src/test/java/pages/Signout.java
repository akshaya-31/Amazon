package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class Signout extends WebTestBase {
	
	@FindBy(id = "nav-link-accountList")
	WebElement account_link;
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	WebElement signingout;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/h1")
	WebElement message;
	
	public Signout()
	{
		PageFactory.initElements(driver, this);
	}

	public void signing_out()
	{
		Utility.mouseOnClick(driver, account_link, signingout);
	}
	
	public String getMessage()
	{
		return message.getText();
	}
}