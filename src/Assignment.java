import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.rolls-roycemotorcars.com");
		 driver.findElement(By.xpath("//span[@class='rrmc-primary-nav-icon js-rrmc-primary-nav-icon']")).click();
}
}

