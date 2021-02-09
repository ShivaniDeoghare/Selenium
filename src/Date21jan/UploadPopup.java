package Date21jan;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup 
{
   public static void main(String[] args) throws InterruptedException, IOException
   {
	   System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demo.guru99.com/test/upload/");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@id='file_wraper0']")).click();
	   Runtime r = Runtime.getRuntime();
	   String st="E:/uploadtest.exe";
	   r.exec(st);
}
	hello github!!!!
}
