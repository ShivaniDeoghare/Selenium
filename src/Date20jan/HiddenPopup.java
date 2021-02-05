package Date20jan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='topMenuButton preventPanelsHiding addons']/following::div[@class='menu_icon']")).click();
      driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
      Alert a = driver.switchTo().alert();
      //WebElement ab = driver.findElement(By.xpath("//span[contains(.,'© 2021 actiTIME Inc. All rights reserved.')]"));
      System.out.println(a.getText());
      
      
      
  }
}
