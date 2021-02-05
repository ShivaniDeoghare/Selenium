package Date3Feb;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependancy2 
{
	 @Test(groups="smoke")
	   public void tc1()
	   {
	   Reporter.log("1Hey",true); 
	   }
	 //regression
	 @Test(groups="Regression", dependsOnGroups="functional")
	   public void tc2()
	   {
	   Reporter.log("2Hey",true); 
	   }
	 @Test(groups="functional", dependsOnGroups="smoke")
	   public void tc3()
	   {
	   Reporter.log("3Hey",true); 
	   }
	 @Test(groups="smoke")
	   public void tc4()
	   {
	   Reporter.log("4Hey",true); 
	   }
	 @Test(groups="functional" , dependsOnGroups="smoke")
	   public void tc5()
	   {
	   Reporter.log("5Hey",true); 
	   }
	 //part of smoke tc
	 @Test(groups="smoke")
	   public void tc6()
	   {
	   Reporter.log("6Hey",true); 
	   }
	 //part of functional tc
	 @Test(groups="functional")
	   public void tc7()
	   {
	   Reporter.log("7Hey",true); 
	   }
	 
}
