package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Encapsulation concept 
//follow 4 rule 1)class should be public 2)private data member 3)public method should present 
//4)one constructor should be there
public class SeleniumHome 
{
  @FindBy(name="search")
  private WebElement search;
  public SeleniumHome(WebDriver driver)//constructor
  {
	  PageFactory.initElements(driver, this);//driver to iniat
	  
  }
  public void sendText(String text)
  {
	  search.sendKeys(text,Keys.ENTER);
  }
}
