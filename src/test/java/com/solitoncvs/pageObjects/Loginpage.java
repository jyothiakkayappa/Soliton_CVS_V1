package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="oneTimePassword")
	@CacheLookup
	WebElement txtOTP;
	
	@FindBy(xpath="//button[text()='Sign In']")
	@CacheLookup
	WebElement txtSignIn;
	
//	@FindBy(xpath="//button[@class='h-dropbtn']")
//	@CacheLookup
//	WebElement mouseOver;
//	
//	@FindBy(xpath="//a[text()='Logout']")
//	@CacheLookup
//	WebElement signOut;
//	
	
	
	//Action Methods for the above
	public void setEmail(String emailId)
	{
		txtEmail.sendKeys(emailId);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setOTP(String otp)
	{
		txtOTP.sendKeys(otp);
	}
	
	public void clickSignIn()
	{
		txtSignIn.click();
	}
	
//	public void mouseOver()
//	{
//		mouseOver.click();
//	}
//	public void signOut()
//	{
//		signOut.click();
//	}
	
}
