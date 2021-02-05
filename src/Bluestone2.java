import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 
{
		public static void main(String[] args) throws InterruptedException
		{
	    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> j = driver.findElements(By.xpath("//a[text()='All Jewellery']"));
		Actions a = new Actions(driver);
		for (WebElement items : j) 
		{   
			//System.out.println(items.getText());
		
		    a.moveToElement(items).build().perform();
		    Thread.sleep(2000);
		}
		   driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		//Thread.sleep(2000);
		
		
		}
		
}
