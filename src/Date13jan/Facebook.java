package Date13jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCssProperty;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement creatacc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	if(creatacc.isEnabled())
	creatacc.click();
	Thread.sleep(3000);
    WebElement male =driver.findElement(By.xpath("//label[text()='Male')]"));
	if (male.isDisplayed())
	{		
	male.click();
	}
	Thread.sleep(2000);
	System.out.println(male.isSelected());
	System.out.println(male.getCssValue("font-size"));
	
	
	}
}
