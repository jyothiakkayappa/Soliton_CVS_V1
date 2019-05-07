package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoLiveWithoutAddingInputControl {
	WebDriver ldriver;
	
	public GoLiveWithoutAddingInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//img[@src='/img/play.png']")
	@CacheLookup
	WebElement addLive;
	
	//Play button
	@FindBy(xpath="//img[@src='/img/l_play.png']")
	@CacheLookup
	WebElement Playbtn;
	
	//Pause button
	@FindBy(xpath="//img[@src='/img/l_pause.png']")
	@CacheLookup
	WebElement Pausebtn;
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@id='output-panel']/div[@class='flexrow']/div[@class='fx-panel']/button[2]/img[1]")
	@CacheLookup
	WebElement endStream;
	
	
	public void addLive()
	{
		addLive.click();
		Playbtn.click();
		
	}
	
	public void addLivewithoutPlaybtn()
	{
		addLive.click();
		
	}
	
	public void endStream()
	{
		endStream.click();
		
	}

}
