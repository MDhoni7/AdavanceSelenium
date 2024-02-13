package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3Test {

	
	@Test
	public void testcase() {
		Reporter.log("test1 case is executed",true);
	}
	
	@Test
	public void testcase1() {
		Reporter.log("test2 case is executed",true);
	}
}
