package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class Login_withInvalidPassword extends WebTestBase {
	@FindBy(id = "ap_email")
	WebElement user;
	
	@FindBy(id = "continue")
	WebElement Continue;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement logged_in;
	
	@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
	WebElement message;
	
	public Login_withInvalidPassword()
	{
		PageFactory.initElements(driver, this);
	}
	public void login_click()
	{
		user.sendKeys(prop.getProperty("username"));
		Continue.click();
		password.sendKeys(prop.getProperty("duplicate_password"));
		logged_in.click();
	}
	public String getMessage()
	{
		return message.getText();
	}
}
