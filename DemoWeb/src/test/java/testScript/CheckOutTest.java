package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomScript.CheckoutPage;
import utilityLibrary.Base;
import utilityLibrary.ReadExcelUtility;



public class CheckOutTest extends Base {

	@Test(dataProvider = "checkoutsheet",priority = 6,dependsOnMethods = "shoppingcartPage")
	public void chechout(String company,String city,String adress1,String adress2,String postcode,String phn,String fax) {
		CheckoutPage cp = new CheckoutPage(driver);
		cp.getBillingNewAddressCompany().sendKeys(company);
		cp.getBillingCountryId().click();
		cp.getChoosecountry().click();
		cp.getOtherstateorprovince().click();
		cp.getChooseotherstateorprovince().click();
		cp.getBillingNewAddressCity().sendKeys(city);
		cp.getBillingNewAddressAddress1().sendKeys(adress1);
		cp.getBillingNewAddressAddress2().sendKeys(adress2);
		cp.getBillingNewAddressZipPostalCode().sendKeys(postcode);
		cp.getBillingNewAddressPhoneNumber().sendKeys(phn);
		cp.getBillingNewAddressFaxNumber().sendKeys(fax);
		cp.getContinuebutton().click();
	}
	
	@DataProvider(name="checkoutsheet")
	public Object[][] data3() throws EncryptedDocumentException, IOException{
		
		return ReadExcelUtility.fetchAllData("Sheet4");
	}
}
