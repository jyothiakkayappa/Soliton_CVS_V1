package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAddedInputControl 
{
	WebDriver ldriver;
	public DeleteAddedInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//img[@src='/img/l_del.png']")
	@CacheLookup
	WebElement deleteInputbtn;
	
	public void deleteAddedInputControl()
	{
		deleteInputbtn.click();	
	}
	

}
