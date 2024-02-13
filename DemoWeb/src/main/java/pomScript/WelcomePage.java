package pomScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class WelcomePage extends BasePage{
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcart;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;

	public WebElement getRegister() {
		return register;
	}

	
	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}


	public WebElement getLoginlink() {
		return loginlink;
	}
	
	
	
}
