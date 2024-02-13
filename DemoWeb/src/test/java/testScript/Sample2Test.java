package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomScript.CheckoutPage;
import pomScript.DigitalDownloadsPage;
import pomScript.LoginPage;
import pomScript.LogoutPage;
import pomScript.RegisterPage;
import pomScript.ShoppingcartPage;
import pomScript.WelcomePage;
import utilityLibrary.Base;
import utilityLibrary.ReadExcelUtility;

public class Sample2Test extends Base{

	@Test(dataProvider = "register",priority = 1)
	public void testregister(String fn,String ln,String em,String pas,String cnp) {
		WelcomePage w = new WelcomePage(driver);
		w.getRegister().click();
		
		RegisterPage r = new RegisterPage(driver);
		r.getGendermale().click();
		r.getFirstName().sendKeys(fn);
		r.getLastName().sendKeys(ln);
		r.getEmail().sendKeys(em);
		r.getPassword().sendKeys(pas);
		r.getConfirmPassword().sendKeys(cnp);
		r.getRegisterbutton().click();
		
		
		
		
	}
	@DataProvider(name="register")
	public Object[][] data1() throws EncryptedDocumentException, IOException {
		
		return ReadExcelUtility.fetchAllData("registersheet");
	}
	
	@Test(dataProvider = "login",priority = 3,dependsOnMethods = "logout")
	public void testcaseLogin(String em,String pas) {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		
		LoginPage l = new LoginPage(driver);
		
		l.getEmail().sendKeys(em);
		l.getPassword().sendKeys(pas);
		l.getLoginbutton().click();
		
		
		
	}
	@DataProvider(name="login")
	public Object[][] data2() throws EncryptedDocumentException, IOException{
		
		return ReadExcelUtility.fetchAllData("loginsheet");
	}
	
	@Test(priority = 2,dependsOnMethods = "testregister")
	public void logout() {
		LogoutPage log = new LogoutPage(driver);
		log.getLogoutlink().click();
	}
	
	
	@Test(priority = 4,dependsOnMethods = "testcaseLogin")
	public void digitaldownloads() {
		DigitalDownloadsPage ddp = new DigitalDownloadsPage(driver);
		ddp.getDigitaldownload().click();
		ddp.getAddtocart2().click();
		ddp.getShoppingcartlink().click();
	}
	
	@Test(priority = 5,dependsOnMethods = "digitaldownloads")
	public void shoppingcartPage() {
		ShoppingcartPage scp = new ShoppingcartPage(driver);
		scp.getTermsconditions().click();
		scp.getCheckoutbutton().click();
	}
	
	
	@Test(dataProvider = "checkout",priority = 6,dependsOnMethods = "shoppingcartPage")
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
	
	@DataProvider(name="checkout")
	public Object[][] data3() throws EncryptedDocumentException, IOException{
		
		return ReadExcelUtility.fetchAllData("Sheet2");
	}
}
