package com.alphabet.gmail.POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.alphabet.gmail.javascriptcode.BasicSettings3;
//Test Valid Login
public class TC001 extends BasicSettings3 
{
	public static void main(String[] args) throws InterruptedException 
	{				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
		
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");
		/*if(hp.verifyPageTitle("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home Page is Displayed");
		}
		else
		{
			System.out.println("Home Page is Not Displayed");
		}*/
		driver.close();
	}
}