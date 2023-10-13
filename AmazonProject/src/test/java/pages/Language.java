package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebTestBase;
import utils.Utility;

public class Language extends WebTestBase {

	@FindBy(id = "icp-nav-flyout" )
	WebElement language_btn;
	
	@FindBy(xpath = "//span[text()='தமிழ்']")
	WebElement tamil_btn;
	
	@FindBy(xpath = "//span[text()='அனைத்தும்']")
	WebElement message;
	
	public Language()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void language_change()
	{
		Utility.mouseOnClick(driver, language_btn, tamil_btn);
	}
	public String getMessage()
	{
		return message.getText();
	}
}
