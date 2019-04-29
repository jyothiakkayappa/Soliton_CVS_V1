package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchEffects 
{
	WebDriver ldriver;
	public SwitchEffects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Switch')]")
	@CacheLookup
	WebElement switchBtn;
	
	@FindBy(xpath="//button[contains(text(),'Fade')]")
	@CacheLookup
	WebElement fadeBtn;
	
	@FindBy(xpath="//button[contains(text(),'Curtain')]")
	@CacheLookup
	WebElement CurtainBtn;
	
	@FindBy(xpath="//button[@class='btn-white']")
	@CacheLookup
	WebElement EndStreamBtn;
	
	
	public void switchBtn()
	{
		switchBtn.click();
	}
	
	public void fadeBtn()
	{
		fadeBtn.click();
	}
	
	public void curtainBtn()
	{
		CurtainBtn.click();
	}
	
	public void endStream()
	{
		EndStreamBtn.click();
	}
	

}
