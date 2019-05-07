package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsers 
{
	WebDriver ldriver;
	public AddUsers(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First name']")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	@CacheLookup
	WebElement userEmail;
	
	@FindBy(xpath="//table[@class='dtable']//select[@class='form-input']")
	@CacheLookup
	WebElement selectPlanDropdown;
	
	//AddUser button
	@FindBy(xpath="//button[contains(text(),'Create Users')]")
	@CacheLookup
	WebElement addUserBtn;
	
	public void clickAddUserBtn()
	{
		addUserBtn.click();
	}
	
	public void firstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void userEmail(String uemail)
	{
		userEmail.sendKeys(uemail);
	}
	
	public void selectUserPlanDropdown()
	{
		selectPlanDropdown.click();
	}
	

}
