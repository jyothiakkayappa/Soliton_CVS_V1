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
	
	
	public void addLive()
	{
		addLive.click();
		Playbtn.click();
		
	}
	
	public void addLivewithoutPlaybtn()
	{
		addLive.click();
		
	}

}
