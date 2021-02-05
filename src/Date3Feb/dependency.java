package Date3Feb;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependency
{
  //1 tc if valid username and password correct 
	//then only run oother tc
	//search java and then click on image 
	
	   /*@Test()
		public void tc1()
		 {
			Reporter.log("1Hey",true); 
		 }
		 */
	// @Test
	 //  public void tc1(enabled=false)
	   {
	   Reporter.log("2Hey",true); 
	   }
		 @Test(dependsOnMethods="tc1")
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

