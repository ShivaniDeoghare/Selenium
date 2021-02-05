import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{
	   public static void main(String[] args)
	   {
		 //System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
	     //ChromeDriver a = new ChromeDriver();
	     
		   System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		   FirefoxDriver a = new FirefoxDriver();

	   }
	
}
