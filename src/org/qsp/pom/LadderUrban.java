package org.qsp.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LadderUrban
{
	
	 @FindBy(className = "close-reveal-modal hide-mobile")
	 private WebElement close;

	  @FindBy(xpath = "//span[contains(.,'Sale')]")
	  private WebElement sale;
	  private WebElement sofaset;
      public LadderUrban(WebDriver driver) 
	 {
        PageFactory.initElements(driver, this);

	}
	  public void closee()
	  {
		  close.click();
	  }
	  public void salemouseHover(WebDriver driver) 
	  {
		Actions a = new Actions(driver);
	    a.moveToElement(sale).perform();
	  }
}
