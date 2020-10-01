package com.alphabet.gmail.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class TC003 extends BasicSettings3
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		LoginPage lp = new LoginPage(driver);
		Object o=lp.login("admin", "admin");

	}

}
