package com.alphabet.gmail.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Error extends BasePage
{
   @FindBy(xpath = "//span[text() =\"Username or Password is invalid. Please try again.\"]")
   private WebElement errormsg;
   
   Error(WebDriver driver)
   {
	 super(driver); 
	 boolean errormsgDisplay=errormsg.isDisplayed();
	 if(errormsgDisplay)
	 {
		 System.out.println("Please Provide correct UserName or Password ");
	 }
	 driver.close();
   }
   
   
}
