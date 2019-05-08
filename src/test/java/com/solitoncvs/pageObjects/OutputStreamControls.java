package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutputStreamControls 
{
	WebDriver ldriver;
	public OutputStreamControls(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'RTSP Output Stream URL')]")
	@CacheLookup
	WebElement rtspStreamControlBtn;
	
	@FindBy(xpath="//div[@class='thumb-panel flexrow']//button[@class='btn-primary'][contains(text(),'Copy')]")
	@CacheLookup
	WebElement copyRTSPUrlBtn;
	
	@FindBy(xpath="//div[contains(text(),'RTMP Output Stream URL')]")
	@CacheLookup
	WebElement rtmpStreamControlBtn;
	
	@FindBy(xpath="//div[@class='thumb-panel']//button[@class='btn-primary'][contains(text(),'Copy')]")
	@CacheLookup
	WebElement copyRTMPUrlBtn;
	
	@FindBy(xpath="//div[contains(text(),'Stream Live to Facebook')]")
	@CacheLookup
	WebElement facebookStreamControlBtn;
	
	
	@FindBy(xpath="//body//div[@class='flexcol']//div[@class='flexcol']//div[@class='flexcol']//div[7]//button[2]")
	@CacheLookup
	WebElement startfacebookStreamControlBtn;
	
	
	@FindBy(xpath="//body//div[@class='flexcol']//div[@class='flexcol']//div[@class='flexcol']//div[7]//button[1]")
	@CacheLookup
	WebElement savefacebookStreamControlBtn;
	
	@FindBy(xpath="//div[contains(text(),'Stream Live to YouTube')]")
	@CacheLookup
	WebElement youTubeStreamControlBtn;
	
	@FindBy(xpath="//div[@id='layoutroot']//div[8]//button[2]")
	@CacheLookup
	WebElement startYouTubeStreamControlBtn;
	
	
	@FindBy(xpath="//body//div[@class='flexcol']//div[@class='flexcol']//div[@class='flexcol']//div[8]//button[1]")
	@CacheLookup
	WebElement saveYouTubeStreamControlBtn;
	
	
	
	public void clickRTSPStreamControl()
	{
		rtspStreamControlBtn.click();
	}
	
	public void clickCopyRTSPOutputUrl()
	{
		copyRTSPUrlBtn.click();
	}
	
	public void clickRTMPStreamControl()
	{
		rtmpStreamControlBtn.click();
	}
	
	public void clickCopyRTMPOutputUrl()
	{
		copyRTMPUrlBtn.click();
	}
	
	public void clickFacebookStreamControl()
	{
		facebookStreamControlBtn.click();
	}
	
	public void clickStartfacebookStreamControlBtn()
	{
		startfacebookStreamControlBtn.click();
	}
	
	public void clickSavefacebookStreamControlBtn()
	{
		savefacebookStreamControlBtn.click();
	}
	
	public void clickYouTubeStreamControl()
	{
		youTubeStreamControlBtn.click();
	}
	
	public void clickStartYouTubeStreamControlBtn()
	{
		startYouTubeStreamControlBtn.click();
	}
	
	public void clickSaveYouTubeStreamControlBtn()
	{
		saveYouTubeStreamControlBtn.click();
	}
	
	

}


