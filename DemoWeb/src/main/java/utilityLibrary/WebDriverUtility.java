package utilityLibrary;


import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor jse;
	public static Properties p;
	
	/**
	 * this method is used to open the url
	 * @param url
	 */
	
	public static void geturl(String url) {
		driver.get(url);
	}
	/**
	 * this method is used to get current url of webpage
	 * @return
	 */
	public static   String currenturl() {
		return driver.getCurrentUrl();
	}
	/**
	 * this method is used to get source code of webpage
	 * @return
	 */
	public static String pagesource() {
		return driver.getPageSource();
	}
	/**
	 * this method is used to title of the web page
	 * @return
	 */
	public static String  title() {
		return driver.getTitle();
	}
	/**
	 * this method is used to implicitly wait for all the elements in web page
	 */
	public static void ImplicitWait() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	/**
	 * this method is used to handle current window of web page
	 * @return
	 */
	public static String currentwindow() {
		return driver.getWindowHandle();
	}
	/**
	 * this method is used to handle all the webpages 
	 * 
	 */
	public static Set<String> allwindow() {
		return driver.getWindowHandles();
	}
	/**
	 * this method is used to maximize the webpage
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the 
	 */
	public static void minimize() {
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to forward the Webpage
	 */
	public static void forward() {
		driver.navigate().forward();
	}
	/**
	 * this method is used to back to previous webpage
	 */
	public static void backward() {
		driver.navigate().back();
	}
	/**
	 * this method is used to refresh the webpage	 
	 * 
	 */
	public static void refersh() {
		driver.navigate().refresh();
	}
	/**
	 * this method is used to  navigate the particular url
	 * 
	 */
	public static void  tourl(String url) {
	    driver.navigate().to(url);
	}
	/**
	 * this method is used to switch to next window
	 */
	
	public static void switchto() {
		driver.switchTo();
	}
	/**
	 * this method is used to close the current window
	 */
	public static void close() {
		driver.close();
	}
	/**
	 * this method is used to close all the window
	 */
	public static void quit() {
		driver.quit();
	}
	/**
	 * this method is used to wait until the all elements are load in webpage
	 * @param element
	 */
	public static void ExplicitWait(WebElement element) {
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is used to select the option from the dropdown by using index number
	 * @param index
	 * @param element
	 */
	
	public static void dropdown(int index,WebElement element) {
		s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * this method is used to select the option from the dropdown by using attribute value
	 * @param value
	 * @param element
	 */
	
	public static void dropdown(String value,WebElement element) {
		s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is used to select the option from the dropdown by using Text function
	 * @param element
	 * @param visibletext
	 */
	
	public static void dropdown(WebElement element,String visibletext) {
		s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	
	//Actions class
	/**
	 * this method is used to move the cursor from one element to another element
	 * @param element
	 */
	public static  void moovecursor(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * this method  is used to do right click on the web element
	 * @param element
	 */
	
	public static void rightclick(WebElement element) {
		a= new Actions(driver);
		a.contextClick().perform();
	}
	/**
	 * this method is used to do double click on the web element
	 * @param element
	 */
	public static void doubleclick(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * this method is used to do drag the source and drop at destination
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source,WebElement destination) {
		a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
	}
	/**
	 * this method is used to do click on the targeted element in webpage
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		a= new Actions(driver);
		a.click(element).perform();
	}
	/**
	 * this method is used to do click any where in the webpage
	 * @param element
	 */
	public static void clickElement() {
		a= new Actions(driver);
		a.click().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
