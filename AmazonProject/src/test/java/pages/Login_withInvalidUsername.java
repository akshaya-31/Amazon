package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class Login_withInvalidUsername extends WebTestBase {

	//locate elements
		@FindBy(id = "ap_email")
		WebElement user;
		
		@FindBy(id = "continue")
		WebElement Continue;
		
		@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
		WebElement message;
		
		public Login_withInvalidUsername()
		{
			PageFactory.initElements(driver, this);
		}
		public void login_click() {
			user.sendKeys(prop.getProperty("duplicate_username"));
			Continue.click();
		}
		
		public String getMessage()
		{
			return message.getText();
		}
}

