package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDropDown 
{
	WebDriver ldriver;
	public UserDropDown(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[contains(text(),'View Full History')]")
	@CacheLookup
	WebElement fullHistory;
	
	public void clickViewFullHistory()
	{
		fullHistory.click();
	}

}
