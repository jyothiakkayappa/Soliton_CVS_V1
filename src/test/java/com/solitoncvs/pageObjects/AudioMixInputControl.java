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
