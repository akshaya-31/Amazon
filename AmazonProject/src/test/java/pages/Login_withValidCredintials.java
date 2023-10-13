package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class Login_withValidCredintials extends WebTestBase{

	//locate elements
	@FindBy(id = "ap_email")
	WebElement user;
	
	@FindBy(id = "continue")
	WebElement Continue;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement logged_in;
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement message;
	
	public Login_withValidCredintials()
	{
		PageFactory.initElements(driver, this);
	}
	public void login_click() throws IOException
	{
		user.sendKeys(prop.getProperty("username"));
		Continue.click();
		password.sendKeys(prop.getProperty("password"));
		logged_in.click();
	}
	public String getLoginMessage()
	{
		return message.getText();
	}
}