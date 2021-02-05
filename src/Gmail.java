import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/login");
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys("shivanideoghare97@gmail.com");
  }
}
