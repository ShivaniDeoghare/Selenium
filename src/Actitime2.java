import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
      //driver.getTitle();
	  WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("admin");
	  WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
	  password.sendKeys("manager");
	  WebElement login = driver.findElement(By.xpath("//div//a[@id='loginButton']"));
	  login.click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='selectedItem']/div[Contains(.,'- Select Customer -']]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//div[@class'searchItemList']/div[Contains(.,'- New Customer -')]")).click();
	  
  }
}
