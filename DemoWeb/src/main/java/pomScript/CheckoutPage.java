package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement billingfirstname;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement billinglastname;
	
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement BillingNewAddressCompany;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement BillingCountryId;
	
	@FindBy(xpath = "//option[text()='India']")
	private WebElement choosecountry;
	
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement otherstateorprovince;
	
	@FindBy(xpath = "//option[text()='Other (Non US)']")
	private WebElement chooseotherstateorprovince;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement BillingNewAddressCity;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement BillingNewAddressAddress1;
	
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement BillingNewAddressAddress2;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement BillingNewAddressZipPostalCode;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement BillingNewAddressPhoneNumber;
	
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement BillingNewAddressFaxNumber;
	
	@FindBy(xpath = "//input[@title='Continue']")
	private WebElement continuebutton;

	public WebElement getBillingfirstname() {
		return billingfirstname;
	}

	public WebElement getBillinglastname() {
		return billinglastname;
	}

	public WebElement getBillingNewAddressCompany() {
		return BillingNewAddressCompany;
	}

	public WebElement getBillingCountryId() {
		return BillingCountryId;
	}

	public WebElement getChoosecountry() {
		return choosecountry;
	}

	public WebElement getBillingNewAddressCity() {
		return BillingNewAddressCity;
	}

	public WebElement getBillingNewAddressAddress1() {
		return BillingNewAddressAddress1;
	}

	public WebElement getBillingNewAddressAddress2() {
		return BillingNewAddressAddress2;
	}

	public WebElement getBillingNewAddressZipPostalCode() {
		return BillingNewAddressZipPostalCode;
	}

	public WebElement getBillingNewAddressFaxNumber() {
		return BillingNewAddressFaxNumber;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getOtherstateorprovince() {
		return otherstateorprovince;
	}

	public WebElement getChooseotherstateorprovince() {
		return chooseotherstateorprovince;
	}

	public WebElement getBillingNewAddressPhoneNumber() {
		return BillingNewAddressPhoneNumber;
	}
	
	
}
