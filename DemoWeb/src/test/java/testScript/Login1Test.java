package testScript;

import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomScript.LoginPage;
import pomScript.LogoutPage;
import pomScript.WelcomePage;
import utilityLibrary.Base;

public class Login1Test extends Base {

	
	@Test
	public void testcase() {
		
		
		
		String Email = System.getProperty("Email");
		String Password = System.getProperty("Password");
		
		Reporter.log(Email,true);
		Reporter.log(Password,true);
		
		WelcomePage w= new WelcomePage(driver);
		w.getLoginlink().click();
		
		String image = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BASE64);
		
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(Email);
		l.getPassword().sendKeys(Password);
		l.getLoginbutton().click();
		
		LogoutPage lo = new LogoutPage(driver);
		lo.getLogoutlink().click();
		
		
		
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\balup\\eclipse-workspace\\DemoWeb\\Extentreport\\reporter.html");
				
				ExtentReports er = new ExtentReports();
				
				er.attachReporter(esr);
				
				ExtentTest et = er.createTest("Sample4Test");
				
				et.log(Status.INFO, "Test Case Successfully Attached To The Property");
				
				et.addScreenCaptureFromBase64String(image);
				
				er.flush();
		
	}
}
