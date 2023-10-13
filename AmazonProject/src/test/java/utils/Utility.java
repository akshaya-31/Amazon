package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.WebTestBase;

public class Utility extends WebTestBase {
	
	public static void mouseOnHover(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void doublecliking(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void mouseOnClick(WebDriver driver, WebElement element,WebElement element1)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		element1.click();
	}
	public static void scrollingdown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void switchTowindows(WebDriver driver, WebElement element)
	{
		//method used to get parent window id
		String ParentWindowId = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String s:allWindow) {
			if(!ParentWindowId.equals(s))//will be true only for my child id
			{
				driver.switchTo().window(s);//scope to moved to my child window
				element.click();
				//driver.close();
			}
		}
	}
	public static void dropdownsearch() throws AWTException, InterruptedException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}