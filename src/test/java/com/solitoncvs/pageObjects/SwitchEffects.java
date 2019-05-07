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
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@id='output-panel']/div[@class='flexrow']/div[@class='fx-panel']/button[2]")
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
