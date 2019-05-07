package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddImageInputControl 
{
	WebDriver ldriver;
	public AddImageInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[1]/div[3]")
	@CacheLookup
	WebElement imageInputControl;
	
	@FindBy(xpath="//div[4]//div[1]//button[1]//img[1]")
	@CacheLookup
	WebElement imageAddBtn;
	
	@FindBy(xpath="//button[@class='btn-primary'][contains(text(),'Upload')]")
	@CacheLookup
	WebElement imageUpladBtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[4]/div[2]/button[1]")
	@CacheLookup
	WebElement previewUploadedImage;
	
	public void clickImageInputControl()
	{
		imageInputControl.click();
	}
	
	public void imageAddButton()
	{
		imageAddBtn.click();
	}
	
	public void clickImageUploadButton()
	{
		imageUpladBtn.click();
	}
	
	public void previewUploadedImage()
	{
		previewUploadedImage.click();
	}
	

}
