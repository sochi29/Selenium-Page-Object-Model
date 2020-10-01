package com.alphabet.gmail.POM;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class TC002 extends BasicSettings3
{
    public static void main(String[] args) 
    {
    	WebDriver driver=setUp();
    	LoginPage lp=new LoginPage(driver);
    	lp.login("admin", "manager");
    	mySleepInSeconds(3);
    	String expectedTitle="actiTIME - Enter Time-Track";
    	String actualTitle=driver.getTitle();
    	if(actualTitle.equals(expectedTitle))
    	{
    	    HomePage hp= new HomePage(driver);
    	    
    	    System.out.println("Home PAge is Found!!!");
    	    hp.clickOnApproval();
    	    hp.clickOnLogout();
    	    
    	}
    	
    	
        String expectedURL	="https://demo.actitime.com/login.do";
    	String actualURL=driver.getCurrentUrl();
    	
    	if(actualURL.equals(actualURL))
    	{
    		System.out.println("Successfully LogOut!!!");
    	}
    	
    	//driver.close();
    	
	  	
	}
}
