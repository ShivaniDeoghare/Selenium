import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8484879079");
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Shivani@1234");
    driver.findElement(By.xpath("//div[@class='_1D1L_j']/button")).click();
    Thread.sleep(2000);
    List<WebElement> items = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
    //List<WebElement> items = driver.findElements(By.xpath("//div[@class='_1kidPb']/descendant::a[contains(.,'Offer Zone')]"));
    //List<WebElement> items = driver.findElements(By.xpath("//div[@class='_1mkliO']/div"));
    for(WebElement itemnumber:items)
    {
    	System.out.println(itemnumber.getText());
    }
 }
}
