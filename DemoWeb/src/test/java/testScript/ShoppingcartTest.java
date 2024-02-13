package testScript;

import org.testng.annotations.Test;

import pomScript.ShoppingcartPage;
import utilityLibrary.Base;



public class ShoppingcartTest  extends Base{

	
	@Test(priority = 5,dependsOnMethods = "digitaldownloads")
	public void shoppingcartPage() {
		ShoppingcartPage scp = new ShoppingcartPage(driver);
		scp.getTermsconditions().click();
		scp.getCheckoutbutton().click();
	}
}
