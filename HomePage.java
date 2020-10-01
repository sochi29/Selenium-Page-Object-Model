package com.alphabet.gmail.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	//Creating WebElements
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(className="switcherBackground")
	private WebElement approvalSwitcher;
	
	@FindBy(id="FormModifiedDivButton")
	private WebElement saveButton;
	
	@FindBy(id="taskSearchControl_field")
	private WebElement taskSearchField;
	
	//Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Action Methods
	public void clickOnLogout()
	{
		logoutLink.click();
	}
	
	public void clickOnApproval()
	{
		approvalSwitcher.click();
		if(saveButton.isDisplayed())
		{
			System.out.println("Save Button is Displayed!!!");
			saveButton.click();
			
		}
		else
		{
			System.out.println("Save Button is not Displayed!!!");
		}
	}
	
	public void searchTask(String keywordToSearch)
	{
		taskSearchField.sendKeys(keywordToSearch);
	}
}

