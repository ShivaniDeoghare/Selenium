package Date5FebTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class otherclassparallelmethods 
{
	@Test
	  public void TC1() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		    Thread.sleep(2000);
		    driver.close();
		    
}
	@Test
	  public void TC2() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.gmail.com/");
		    Thread.sleep(2000);
		    driver.close();
}
	@Test
	  public void TC3() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.justdial.com/");
		    Thread.sleep(2000);
		    driver.close();
		    
}
	
}

