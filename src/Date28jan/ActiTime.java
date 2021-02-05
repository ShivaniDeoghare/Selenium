package Date28jan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime
{
  public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  FileInputStream fis = new FileInputStream("E:\\Book1.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet("Sheet1");
	  Cell cl= sh.getRow(2).getCell(1);
   System.out.println(cl);
	/*  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  WebElement x = driver.findElement(By.name("username"));
	  x.sendKeys(cl);*/
	  
	  //river.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  
      
  }
}
