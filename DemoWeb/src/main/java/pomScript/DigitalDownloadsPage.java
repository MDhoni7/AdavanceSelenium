package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadsPage extends BasePage {
	public DigitalDownloadsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownload;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addtocart1;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement addtocart2;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	private WebElement addtocart3;
	

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;

	public WebElement getDigitaldownload() {
		return digitaldownload;
	}

	public WebElement getAddtocart1() {
		return addtocart1;
	}

	public WebElement getAddtocart2() {
		return addtocart2;
	}

	public WebElement getAddtocart3() {
		return addtocart3;
	}
	
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}
	
}
