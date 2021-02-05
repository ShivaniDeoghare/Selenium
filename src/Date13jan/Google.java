package Date13jan;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Google 
{
	public static void main(String[] args) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
	Thread.sleep(2000);
    driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
    WebElement value =driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    System.out.println(value.getAttribute("value"));
    value.clear();
    driver.findElement(By.name("q")).sendKeys("Testng",Keys.ENTER);
   	
	
	
	}
}
