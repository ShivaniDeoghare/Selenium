package Date29jan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHq 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(2000);
	  WebElement search = driver.findElement(By.xpath("//input[@class='gsc-input']"));
	  search.sendKeys("java",Keys.ENTER);
	  driver.navigate().back();
	  search.sendKeys("testng",Keys.ENTER);
}
}
