package Date3Feb;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTimeTestCase {
@Test(invocationCount=5)//defult value is  1
public void tc()//multiple i/p like login page we have multiple date //data driven testing 
//checking same module with different i/p
{
	Reporter.log("hey..",true);
}
}
