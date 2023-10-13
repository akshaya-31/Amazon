package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;

public class SigninPage extends WebTestBase {
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement find_signin;
	
	public SigninPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signIn_click() {
		find_signin.click();
	}

}
