package testScript;

import org.testng.annotations.Test;

import pomScript.DigitalDownloadsPage;
import utilityLibrary.Base;



public class DigitalDownloadsTest extends Base {

	
	@Test(priority = 4,dependsOnMethods = "login")
	public void digitaldownloads() {
		DigitalDownloadsPage ddp = new DigitalDownloadsPage(driver);
		ddp.getDigitaldownload().click();
		ddp.getAddtocart2().click();
		ddp.getShoppingcartlink().click();
	}
}
