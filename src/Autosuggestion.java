import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		  Thread.sleep(2000);
		 List<WebElement> items = driver.findElements(By.xpath("//span[contains(.,'java')]/ancestor::li"));
		  for (WebElement menuitem : items) 
		  { 
			  System.out.println(menuitem.getText());
			
		  }
		 // WebDriver menuitem;
		//menuitem.get(2).click;
	}

}
