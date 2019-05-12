package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVideoInputControl 
{
	WebDriver ldriver;
	public AddVideoInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@id='inputTabVideos']")
	@CacheLookup
	WebElement videoInputControl;
	
	@FindBy(xpath="//div[3]//div[1]//button[1]//img[1]")
	@CacheLookup
	WebElement videoAddBtn;
	
	@FindBy(xpath="//button[@class='btn-primary'][contains(text(),'Upload')]")
	@CacheLookup
	WebElement uploadBtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[3]/div[2]/button[1]")
	@CacheLookup
	WebElement clickUploadedVideo;
	
	
	
	
	public void clickVideoInputControl()
	{
		videoInputControl.click();
	}
	
	public void videoAddBtn()
	{
		videoAddBtn.click();
	}
	public void clickUploadButton()
	{
		uploadBtn.click();
	}
	
	public void previewUploadVideoInput()
	{
		clickUploadedVideo.click();
		
	}
	
	

}
