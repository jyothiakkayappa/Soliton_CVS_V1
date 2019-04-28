package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewInputControl {
	WebDriver ldriver;
	
	public PreviewInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='34476490-6805-11e9-9d98-b1765e760e73']")
	@CacheLookup
	WebElement previewinput;
	
	public void previewInputControl()
	{
		previewinput.click();
	}

}
