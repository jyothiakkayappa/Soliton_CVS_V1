package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLiveBroadcast 
{
	WebDriver ldriver;
	public AddLiveBroadcast(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//img[@src='/img/plus-c.png']")
	@CacheLookup
	WebElement addRTSPUrl;
	
	@FindBy(xpath="//input[@id='txtLive']")
	@CacheLookup
	WebElement addLiveurl;
	
	@FindBy(xpath="//button[text()='Add']")
	@CacheLookup
	WebElement addButton;
	
	
	public void addUrl()
	{
		addRTSPUrl.click();
	}
	
	public void addLiveUrl(String url)
	{
		addLiveurl.clear();
		addLiveurl.sendKeys(url);
	}
	
	public void addButton()
	{
		addButton.click();
	}
	
	
}