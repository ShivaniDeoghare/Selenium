package Date3Feb;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class StopExecutionTc1
{
	@Test()
	public void tc1()
	 {
		Reporter.log("1Hey",true); 
	 }
	 @Test(enabled=false)//1st way 
	 //2nd way @Test(invocationCount=0)//defalut value is 1 so it will not execute tc
	 public void tc2()
	 {
		Reporter.log("2Hey",true); 
	 }
	 @Test(priority=-2)
	 public void tc3()
	 {
		Reporter.log("3Hey",true); 
	 }
}
