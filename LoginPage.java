package com.alphabet.gmail.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage
{
	//Creating WebElements
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement rememberCheckbox;
	
	@FindBy(linkText="Forgot your password?")
	private WebElement forgotPasswordLink;
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Creating Action Methods
	public Object login(String usernameValue,String passwordValue) 
	{
		if(usernameValue.equals("admin")&&passwordValue.equals("manager"))
		{
		username.sendKeys(usernameValue);
		password.sendKeys(passwordValue);
		loginButton.click();
	   return new HomePage(driver);
		}
		else
		{
			username.sendKeys(usernameValue);
			password.sendKeys(passwordValue);
			//Thread.sleep(3000);
			loginButton.click();
			return new Error(driver);
		}
	}
	
	public void clickRememberCheckBox()
	{
		rememberCheckbox.click();
	}
	
	public void forgotPasswordLink()
	{
		forgotPasswordLink.click();
	}
}

