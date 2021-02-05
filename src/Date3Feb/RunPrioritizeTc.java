package Date3Feb;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunPrioritizeTc 
{
 @Test//defult value of priority is 0.
 public void tc1()
 {
	Reporter.log("1Hey",true); 
 }
 @Test(priority=2)
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
