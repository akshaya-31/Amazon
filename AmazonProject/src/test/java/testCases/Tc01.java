package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.SigninPage;
import pages.Signout;
import pages.Login_withInvalidUsername;
import pages.Login_withValidCredintials;
import pages.SearchByCategories;
import pages.SearchByFilters;
import pages.AddToCart;
import pages.AddToWishList;
import pages.BuyNow;
import pages.CheckOutCart;
import pages.GeneralSearch_withSearchBox;
import pages.Language;
import pages.Login_withInvalidPassword;
import base.WebTestBase;


public class Tc01 extends WebTestBase {

	SigninPage signinpage;
	Login_withValidCredintials login_withvalidcredentials;
	Login_withInvalidUsername login_withinvalidusername;
	Login_withInvalidPassword login_withinvalidpassword;
	GeneralSearch_withSearchBox generalsearchwithsearchbox;
	SearchByCategories searchbycategories;
	SearchByFilters searchbyfilters;
	AddToCart addtocart;
	AddToWishList addtowishlist;
	BuyNow buynow;
	CheckOutCart checkoutcart;
	Language language;
	Signout signout;
	
	public Tc01()
	{
		super();
	}
	@BeforeMethod
	public void beforemethod()
	{
		initialization();
		signinpage = new SigninPage();
		login_withvalidcredentials = new Login_withValidCredintials();
		login_withinvalidusername = new Login_withInvalidUsername();
		login_withinvalidpassword = new Login_withInvalidPassword();
		generalsearchwithsearchbox = new GeneralSearch_withSearchBox();
		searchbycategories = new SearchByCategories();
		searchbyfilters = new SearchByFilters();
		addtocart = new AddToCart();
		addtowishlist = new AddToWishList();
		buynow = new BuyNow();
		checkoutcart = new CheckOutCart();
		language = new Language();
		signout = new Signout();
	}
	@Test(priority=0)
	public void loginwithvalid_TestCase() throws IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		softassert.assertEquals(login_withvalidcredentials.getLoginMessage(), "Hello, Akshaya","You have successfully logged in");
		softassert.assertAll();
	}
	@Test(priority=1)
	public void loginwithinvalidusername_TestCase()
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withinvalidusername.login_click();
		softassert.assertEquals(login_withinvalidusername.getMessage(), "We cannot find an account with that email address","failed");
		softassert.assertAll();
	}
	@Test(priority=2)
	public void loginwithinvalidpassword_TestCase()
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withinvalidpassword.login_click();
		softassert.assertEquals(login_withinvalidpassword.getMessage(), "Your password is incorrect","Failed");
		softassert.assertAll();
	}
	@Test(priority=3)
	public void generalsearch_TestCase() throws IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		generalsearchwithsearchbox.searching();
		softassert.assertEquals(generalsearchwithsearchbox.getMessage(), "\"water bottles\"","failed");
		softassert.assertAll();
	}
	@Test(priority=10)
	public void searchbycategories_TestCase() throws InterruptedException, IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		searchbycategories.search_bycategories();
		Thread.sleep(3000);
		softassert.assertEquals(searchbycategories.getMessage(), "Women's Watches","Failed");
		softassert.assertAll();
	}
	@Test(priority=5)
	public void searchbyfilter_TestCase() throws InterruptedException, IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		searchbyfilters.searching();
		softassert.assertEquals(searchbyfilters.getMessage(), "\"mobiles\"","Failed");
		softassert.assertAll();
	}
	@Test(priority=6)
	public void addtocart_TestCase() throws InterruptedException, IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		addtocart.searching();
		softassert.assertEquals(addtocart.getMessage(), "Added to Cart", "failed");
		softassert.assertAll();
	}
	@Test(priority=7)
	public void addtowishlist_TestCase() throws InterruptedException, IOException {
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		addtowishlist.wishList();
		softassert.assertEquals(addtowishlist.getMessage(), "Shopping List", "failed");
		softassert.assertAll();
	}
	@Test(priority=8)
	public void buynow_TestCase() throws AWTException, InterruptedException, IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		buynow.buynow_dropdown();
		softassert.assertEquals(buynow.getMessage(), "Order Summary", "Failed");
		softassert.assertAll();
	}
	@Test(priority=9)
	public void checkout_TestCase() throws InterruptedException, IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		checkoutcart.checkout();
		softassert.assertEquals(buynow.getMessage(), "Order Summary", "Failed");
		softassert.assertAll();
	}
	@Test(priority=4)
	public void signinout_TestCase() throws IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		signout.signing_out();
		softassert.assertEquals(signout.getMessage(), "Sign in","Failed");
		softassert.assertAll();
	}
	@Test(priority=11)
	public void languageChange_TestCase() throws IOException
	{
		SoftAssert softassert = new SoftAssert();
		signinpage.signIn_click();
		login_withvalidcredentials.login_click();
		language.language_change();
		softassert.assertEquals(language.getMessage(), "அனைத்தும்","Failed");
		softassert.assertAll();
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close(); 
	}
}
