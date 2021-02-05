package Date4FebTestng;

import org.testng.annotations.DataProvider;

public class DemoDataProvider
{

  @DataProvider
  public static String[][] demo()
  {
	  String[][] str = new String[3][2];
	  str[0][0]="UserA";
	  str[0][1]="A";
	  str[1][0]="UserB";
	  str[1][1]="B";
	  str[2][0]="UserC";
	  str[2][2]="C";
	  return str;
  }
}
