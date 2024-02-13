package testScript;

import org.testng.annotations.Test;

import pomScript.LogoutPage;
import utilityLibrary.Base;



public class LogOutTest extends Base{

	
	@Test(priority = 2,dependsOnMethods = "register")
	public void logout() {
		LogoutPage log = new LogoutPage(driver);
		log.getLogoutlink().click();
	}
}
