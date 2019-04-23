package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateNewBroadcast {
	WebDriver ldriver;
	
	public CreateNewBroadcast(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="title")
	@CacheLookup
	WebElement txtBroadcastName;
	
	@FindBy(xpath="//button[text()='Start']")
	@CacheLookup
	WebElement startButton;
	
	@FindBy(xpath="//button[text()='View']")
	@CacheLookup
	WebElement viewButton;
	
	public void broadcasteName(String name)
	{
		txtBroadcastName.sendKeys(name);
	}
	
	public void startBroadcast()
	{
		startButton.click();
	}
	
	public void viewBroadcast()
	{
		viewButton.click();
	}
	
	

}
