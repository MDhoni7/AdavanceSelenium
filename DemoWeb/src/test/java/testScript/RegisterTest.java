package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pomScript.RegisterPage;
import pomScript.WelcomePage;
import utilityLibrary.Base;
import utilityLibrary.ReadExcelUtility;

public class RegisterTest extends Base {
	@Test(dataProvider = "registersheet",priority = 1)
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
	@DataProvider(name="registersheet")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		
		return ReadExcelUtility.fetchAllData("Sheet2");
	}
}
