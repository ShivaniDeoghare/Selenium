package Assignemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.bluestone.com/jewellery.html"); 
	 Thread.sleep(2000);
     driver.findElement((By.xpath("//a[@title='Coins']"))).click();
    //List<WebElement> menus= driver.findElements(By.xpath("//span[contains(.,'1 gram')]/parent::li[@class='active']/following::li[4]"));
     List<WebElement> menus = driver.findElements(By.xpath("//span[contains(.,'1 gram')]/parent::li/following::li[4]/span[@data-p='gold-coins-weight-20gms,m']"));
     for (WebElement coin : menus) 
    {
		System.out.println(coin.getText());
		
	}
 }
}
