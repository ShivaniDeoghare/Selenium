import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{  
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'login / Signup')]")).click();
		driver.findElement(By.xpath("//div[@class='form-group ']/input")).sendKeys("8484879079");
		driver.findElement(By.xpath("//div[@class='midLinks']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[contains(.,' Password ')]")).click();
		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("Shivani@123");
	    //driver.findElement(By.xpath("//div[@class='bottomeLink']/span[contains(.,'Password')]")).click();
		List<WebElement> menubar = driver.findElements(By.xpath("//div[@class='desktop-navlink-container']/div"));
		for(WebElement menuitem:menubar)
		{
			System.out.println(menuitem.getText());
		}
	}

}
