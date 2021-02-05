package org.qsp.testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class TestSeleniumHome 
{
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(2000);
	  SeleniumHome sh= new SeleniumHome(driver);
	  sh.sendText("java");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  sh.sendText("testng");
	  Thread.sleep(2000);
	  driver.close();
	}
}
