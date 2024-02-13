package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
}
