package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomScript.LoginPage;
import pomScript.WelcomePage;
import utilityLibrary.Base;
import utilityLibrary.ReadExcelUtility;



public class Logintest extends Base {

	@Test(dataProvider = "loginsheet",priority = 3,dependsOnMethods = "logout")
	public void testcaseLogin(String em,String pas) {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		
		LoginPage l = new LoginPage(driver);
		
		l.getEmail().sendKeys(em);
		l.getPassword().sendKeys(pas);
		l.getLoginbutton().click();
		
		
		
	}
	@DataProvider(name="loginsheet")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		return ReadExcelUtility.fetchAllData("Sheet3");
	}
}
