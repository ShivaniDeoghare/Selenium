package Date20jan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification 
{
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--disable-notification");
	  WebDriver driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
	  driver.get("https://www.myntra.com/");
}
}
