package Date5FebTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Democross
{   
	@Parameters("browser")//without this annotation it will not work
	@Test
	  public void TC1(String browser) throws InterruptedException
	  {
		  WebDriver driver = null;
		  if(browser.equalsIgnoreCase("Chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
           driver = new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	           driver = new FirefoxDriver();
		  }
		  else
		  {
			  driver = null;
		  }
		    driver.manage().window().maximize();
			driver.get("https://www.justdial.com/");
		    Thread.sleep(2000);
		    driver.close();
		    
}
}
