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
	
	@FindBy(xpath="//button[@class='btn-white not-selectedTab']")
	@CacheLookup
	WebElement myMediaBtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexrow']/div/div[@class='flexcol']/div[2]/div[1]/button[1]")
	@CacheLookup
	WebElement selectImage;
	
	@FindBy(xpath="//div[28]//button[3][text()='Delete']")
	@CacheLookup
	WebElement deleteSelectImage;
	
	@FindBy(xpath="//div[28]//button[1]")
	@CacheLookup
	WebElement selectAllImage;
	
	
	public void clickViewFullHistory()
	{
		fullHistory.click();
	}
	
	public void clickMyMedia()
	{
		myMediaBtn.click();
	}
	
	public void clickToSelectImage()
	{
		selectImage.click();
	}
	
	public void clickDeleteSelectImage()
	{
		deleteSelectImage.click();
	}
	
	public void clickSelectAllImage()
	{
		selectAllImage.click();
	}

}
