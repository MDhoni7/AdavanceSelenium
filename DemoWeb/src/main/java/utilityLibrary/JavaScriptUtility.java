package utilityLibrary;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebDriverUtility {
	/**
	 * this method ois used to scroll the webpage to x axis and y axis 
	 * @param x
	 * @param y
	 */
	public static void scroll_by(int x, int y) {
		jse = (JavascriptExecutor) driver;
		jse . executeScript("Window.ScrollBy(" + x + "," + y + ")");
	}
	/**
	 * this method is used to scroll the webpage from the resume point
	 * @param x
	 * @param y
	 */
	public static void scroll_To(int x,int y) {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * this method is used to scroll the page until the element is visible
	 * @param b
	 * @param element
	 * @param index
	 */
	public static void scroll_In_To_View(boolean b,WebElement element,int index) {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments["+index+"].scrollInToview("+b+");",element);
	}
	/**
	 * this method is used to click the disable element
	 * @param element
	 * @param index
	 */
	public static void clickDisable(WebElement element,int index) {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",element);
	}
	

}
