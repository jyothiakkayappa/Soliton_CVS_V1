package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudioMixInputControl 
{
	WebDriver ldriver;
	public AudioMixInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='audioLiveMixUrl']")
	@CacheLookup
	WebElement mixLiveUrlTextbox;
	
	@FindBy(xpath="//div[@class='live-panel']//div[@class='flexrow']//button[1]//div[1]")
	@CacheLookup
	WebElement mixLiveBtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[@class='thumb-panel']/div[@class='flexrow']/button[3]")
	@CacheLookup
	WebElement stopMixingBtnfromInputControl;
	
	@FindBy(xpath="//div[@id='inputTabAudioMix']")
	@CacheLookup
	WebElement audioMixBtn;
	
	@FindBy(xpath="//button[4]//div[1]//img[1]")
	@CacheLookup
	WebElement addAudioFile;
	
	@FindBy(xpath="//button[@class='btn-primary'][contains(text(),'Upload')]")
	@CacheLookup
	WebElement uploadAudioFile;
	
	//Preview Audio File
	@FindBy(xpath="//tr[2]//td[3]//div[1]//button[1]//img[1]")
	@CacheLookup
	WebElement previewAudioFile;
	
	//Play AudioMix file by clicking playButton
	@FindBy(xpath="//tr[2]//td[4]//div[1]//button[1]")
	@CacheLookup
	WebElement audioMixPlayBtn;
	
	//Audio Drag
	@FindBy(xpath="//input[@id='myRange']")
	@CacheLookup
	WebElement audioMixDragLeft;
	
	//Stop Audio Mixing
	@FindBy(xpath="//div[@class='flexcol']//div[@class='flexcol']//div//div[@class='flexcol preview-panel']//button[@class='btn-white']//div")
	@CacheLookup
	WebElement stopMixingBtn;
	
	public void addMixLiveUrl(String url)
	{
		mixLiveUrlTextbox.sendKeys(url);
	}
	
	public void clickMixLiveBtn()
	{
		mixLiveBtn.click();
	}
	
	public void clickStopMixingfromInputControl()
	{
		stopMixingBtnfromInputControl.click();
	}
	
	public void clickAudioMixInput()
	{
		audioMixBtn.click();
	}
	
	public void clickaddAudioFile()
	{
		addAudioFile.click();
	}
	
	public void clickUploadBtn()
	{
		uploadAudioFile.click();
	}
	
	public void clickPreviewAudioFile()
	{
		previewAudioFile.click();
	}
	
	public void clickAudioMixPlayBtn()
	{
		audioMixPlayBtn.click();
	}
	
	public void clickStopMixing()
	{
		stopMixingBtn.click();
	}

}
