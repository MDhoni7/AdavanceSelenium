package utilityLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base extends WebDriverUtility {
	
	@BeforeSuite
	public void connectserver() {
		Reporter.log("connection to the server",true);
	}
	
	@BeforeTest
	public void connectdb() {
		Reporter.log("connection to the Data Base",true);
	}
	
	@BeforeClass
	public void openBrowse() throws IOException {
		Reporter.log("Opening the Browser",true);
		driver = new ChromeDriver();
		maximize();
		ImplicitWait();
		String url=PropertyFileUtility.propertydata("url");
		geturl(url);
		
	}
	@BeforeMethod
	public void login() {
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("unluckyfellow@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Unlucky@99");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		Reporter.log("Login is successfull",true);
	}
	@AfterMethod
	public void logout() {
//		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logout is successfull",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Closing the Browser",true);
		driver.quit();
	}
	@AfterTest
	public void disconnectdb() {
		Reporter.log("disconnection to the Data Base",true);
	}
	@AfterSuite
	public void disconnectserver() {
		Reporter.log("disconnection to the server",true);
	}
}
