package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTextInputControl 
{
	WebDriver ldriver;
	public AddTextInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div[@id='inputTabText']")
	@CacheLookup
	WebElement textInputControl;
	
	@FindBy(xpath="//input[@placeholder='Enter your text...']")
	@CacheLookup
	WebElement entertext;
	
	@FindBy(xpath="//button[contains(text(),'Add Text')]")
	@CacheLookup
	WebElement addtextBtn;
	
	@FindBy(xpath="//button[contains(text(),'Remove Text')]")
	@CacheLookup
	WebElement removeTextBtn;
	
	public void clickTextInputControl()
	{
		textInputControl.click();
	}
	
	public void entertext(String text)
	{
		entertext.sendKeys(text);;
	}
	
	public void clickAddText()
	{
		addtextBtn.click();
	}
	
	public void clickRemoveText()
	{
		removeTextBtn.click();
	}

}
