package luma.nyc.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.nyc.basepage.SuperClass;
import luma.nyc.generic.CommonUtil;
import luma.nyc.generic.WaitHelper;

public class LumaPageFactory extends SuperClass {

	public LumaPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickSigninAtHomePage;

	public WebElement getClickHomePageSignin() {
		return clickSigninAtHomePage;
	}

	@FindBy(xpath = "//*[@id= 'email']")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//*[@id= 'pass']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickFinalSignin;

	public WebElement getClickFinalSignin() {
		return clickFinalSignin;
	}

	public void getLogin() {
		WaitHelper.waitForElements(getClickHomePageSignin());
		CommonUtil.actionClick(getClickHomePageSignin());

		WaitHelper.waitForElements(getEnterEmail());
		getEnterEmail().sendKeys(prop.getProperty("UserName"));

		WaitHelper.waitForElements(getEnterPassword());
		getEnterPassword().sendKeys("Password");

		WaitHelper.waitForElements(getClickFinalSignin());
		CommonUtil.actionClick(getClickFinalSignin());
	}

	@FindBy(xpath = "(//*[text()='Welcome, Tanvir Patwary!'])[1]")
	@CacheLookup
	private WebElement verifyUserInfo;

	public WebElement getVerifyUserInfo() {
		return verifyUserInfo;
	}

	@FindBy(linkText = "Men")
	@CacheLookup
	private WebElement selectMen;

	public WebElement getSelectMen() {
		return selectMen;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;
	}

	@FindBy(linkText = "Jackets")
	@CacheLookup
	private WebElement clickJacket;

	public WebElement getClickJacket() {
		return clickJacket;
	}

	@FindBy(partialLinkText = "Montana Wind Jacket")
	@CacheLookup
	private WebElement jacketsName;

	public WebElement getJacketsName() {
		return jacketsName;
	}

	@FindBy(xpath = "//*[@id = 'option-label-size-143-item-167']")
	@CacheLookup
	private WebElement selectSize;

	public WebElement getSelectSize() {
		return selectSize;
	}

	@FindBy(xpath = "//*[@id = 'option-label-color-93-item-58']")
	@CacheLookup
	private WebElement selectColor;

	public WebElement getSelectColor() {
		return selectColor;
	}

	@FindBy(xpath = "//*[@id = 'qty']")
	@CacheLookup
	private WebElement enterQuantity;

	public WebElement getEnterQuantity() {
		return enterQuantity;
	}

	@FindBy(xpath = "//*[text() = 'Add to Cart']")
	@CacheLookup
	private WebElement clickAddToCart;

	public WebElement getClickAddToCart() {
		return clickAddToCart;
	}

	public void getJacket() {
		WaitHelper.waitForElements(getSelectSize());
		CommonUtil.actionClick(getSelectSize());

		WaitHelper.waitForElements(getSelectColor());
		CommonUtil.actionClick(getSelectColor());

		//WaitHelper.waitForElements(getEnterQuantity());
		//getEnterQuantity().sendKeys(prop.getProperty("Quantity")); // from .properties file

		WaitHelper.waitForElements(getClickAddToCart());
		CommonUtil.actionClick(getClickAddToCart());
	}

	@FindBy(partialLinkText = "shopping cart")
	@CacheLookup
	private WebElement shoppingCart;

	public WebElement clickShoppingCart() {
		return shoppingCart;
	}

	@FindBy(xpath = "(//*[text()='Proceed to Checkout'])[2]")
	@CacheLookup
	private WebElement checkOut;

	public WebElement clickCheckOut() {
		return checkOut;
	}
	
	@FindBy(xpath = "//*[@name ='firstname']")
	@CacheLookup
	private WebElement firstName;

	public WebElement enterFirstName() {
		return firstName;
	}

	@FindBy(xpath = "//*[@name ='lastname']")
	@CacheLookup
	private WebElement lastName;

	public WebElement enterLastName() {
		return lastName;
	}

	@FindBy(xpath = "//*[@name ='company']")
	@CacheLookup
	private WebElement companyName;

	public WebElement enterCompanyName() {
		return companyName;
	}

	@FindBy(xpath = "//*[@name ='street[0]']")
	@CacheLookup
	private WebElement streetAddress;

	public WebElement enterStreetAddress() {
		return streetAddress;
	}

	@FindBy(xpath = "//*[@name ='city']")
	@CacheLookup
	private WebElement cityName;

	public WebElement enterCityName() {
		return cityName;
	}

	public void enterCustomerDetails() {

		// from .properties file
		WaitHelper.waitForElements(enterFirstName());
		enterFirstName().sendKeys(prop.getProperty("FirstName"));

		WaitHelper.waitForElements(enterLastName());
		enterLastName().sendKeys(prop.getProperty("LastName"));

		WaitHelper.waitForElements(enterCompanyName());
		enterCompanyName().sendKeys(prop.getProperty("CompanyName"));

		WaitHelper.waitForElements(enterStreetAddress());
		enterStreetAddress().sendKeys(prop.getProperty("StreetAddress"));

		WaitHelper.waitForElements(enterCityName());
		enterCityName().sendKeys(prop.getProperty("CityName"));
	}

}
