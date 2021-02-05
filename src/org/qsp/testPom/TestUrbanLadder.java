package org.qsp.testPom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBys;

import Date22jan.UrbanLadder;
import org.qsp.pom.*;

public class TestUrbanLadder 
{
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	LadderUrban ur = new LadderUrban(driver);
	ur.salemouseHover(driver);
	ur.closee();
	
	
	
	
	}
  
}
