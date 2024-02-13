package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingcartPage  extends BasePage{
	public ShoppingcartPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "termsofservice")
	private WebElement termsconditions;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;

	public WebElement getTermsconditions() {
		return termsconditions;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
}
