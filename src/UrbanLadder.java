import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	//driver.findElements(By.xpath("//span[contains(.,'Sale')]"));
	//driver.findElement(By.xpath("//span[contains(.,'Living')]/parent::li"));
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	
	List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	Actions a = new Actions(driver);
	for (WebElement menuname:menu) 
	{
		System.out.println(menuname.getText());
		a.moveToElement(menuname).build().perform();
		Thread.sleep(2000);
	}
  }
}
