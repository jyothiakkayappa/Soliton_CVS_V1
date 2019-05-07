package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWatermarkInputControl 
{
	WebDriver ldriver;
	public AddWatermarkInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@id='inputTabWatermark']")
	@CacheLookup
	WebElement watermarkInputControl;
	
	@FindBy(xpath="//button[contains(text(),'Upload Image')]")
	@CacheLookup
	WebElement uploadImageBtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[7]/div[3]/button[1]")
	@CacheLookup
	WebElement uploadSelectedImage;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[7]/div[1]/button[2]")
	@CacheLookup
	WebElement removeWatermark;
	
	@FindBy(xpath="//button[contains(text(),'Change Image')]")
	@CacheLookup
	WebElement changeWatermarkImageBtn;
	
	@FindBy(xpath="//button[@class='btn-white'][contains(text(),'Upload')]")
	@CacheLookup
	WebElement changedWatermarkImageUploadBtn;
	
	//Remove water mark
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[7]/div[1]/button[2]")
	@CacheLookup
	WebElement removeWatermarkBtn;
	
	//Are you sure ?
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[7]/div[2]/button[1]")
	@CacheLookup
	WebElement areyouSureRemoveWaterMark;
	
	@FindBy(xpath="//button[contains(text(),'Overlay Watermark')]")
	@CacheLookup
	WebElement overlayWatermark;
	
	@FindBy(xpath="//button[contains(text(),'Remove Overlay')]")
	@CacheLookup
	WebElement removeOverlayBtn;
	
	
	
	public void clickWatermarkInputControl()
	{
		watermarkInputControl.click();
	}
	
	public void clickUploadImageBtn()
	{
		uploadImageBtn.click();
	}
	
	public void clickUploadSelectedImage()
	{
		uploadSelectedImage.click();
	}
	
	public void clickRemoveWatermark()
	{
		removeWatermark.click();
	}
	
	public void clickChangeWatermarkImage()
	{
		changeWatermarkImageBtn.click();
	}
	
	public void clickchangedWatermarkImageUpload()
	{
		changedWatermarkImageUploadBtn.click();
	}
	
	public void clickRemoveWatermarkBtn()
	{
		removeWatermarkBtn.click();
	}
	
	public void clickAreyousureRemoveWMBtn()
	{
		areyouSureRemoveWaterMark.click();
	}
	
	public void clickOverlayWatermark()
	{
		overlayWatermark.click();
	}
	
	public void clickRemoveOverlay()
	{
		removeOverlayBtn.click();
	}

}
