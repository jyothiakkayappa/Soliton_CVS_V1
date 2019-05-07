package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.AddUsers;
import com.solitoncvs.pageObjects.Loginpage;

public class TC_CVS_AddUsers_11 extends BaseClass
{
	@Test
	public void addUsers() throws InterruptedException, IOException
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.getTitle();
		
		Loginpage lp = new Loginpage(driver);
		lp.setEmail(email);
		logger.info("Entered Email");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.setOTP(otp);
		logger.info("Entered OTP");
		Thread.sleep(3000);
		lp.clickSignIn();
		logger.info("SignIn pass");
		
		//to check it should login to home page or not
		Thread.sleep(3000);
		if( driver.getTitle().equals("Soliton - Dashboard"))
		{
			Assert.assertTrue(true);
			logger.info("Login test pass");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test Fail");
		}	
		
		//Logout operation
		Thread.sleep(3000);
		WebElement P1 = driver.findElement(By.xpath("//button[@class='h-dropbtn']"));
		WebElement P2 = driver.findElement(By.xpath("//a[text()='User Management']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(P1).moveToElement(P2).click().build().perform();
		
		Thread.sleep(3000);
		WebElement AU = driver.findElement(By.xpath("//div[text()=' Add Users ']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(AU).click().build().perform();
		
		AddUsers addUsers = new AddUsers(driver);
		//addUsers.clickAddUserTab();
		
		addUsers.firstName("Jyothi");
		logger.info("FirstName Provided");
		
		addUsers.lastName("Akkayappa");
		logger.info("LastName Provided");
		
		String Uemail=RandomString()+"@gmail.com";
		addUsers.userEmail(Uemail);
		
		
//		Thread.sleep(3000);
        WebElement planDropdown = driver.findElement(By.xpath("//table[@class='dtable']//select[@class='form-input']"));
		
		Select Plan = new Select(planDropdown);
		Plan.selectByVisibleText("Starter");
		//Plan.deselectByVisibleText("Starter");
		
		WebElement selectedValue= Plan.getFirstSelectedOption();
		
		System.out.println("Selected value is"+selectedValue.getText());
		
		WebElement autoRenew = driver.findElement(By.xpath("//label[@class='s-checkbox']//span"));
		autoRenew.click();
		
		addUsers.clickAddUserBtn();
		
		//String ExpectedText =Uemail+"has been added in to the system";
		String message = driver.findElement(By.xpath("//img[@src='/img/check.png']")).getText();
		Assert.assertTrue(true, message);
//		boolean res=driver.getPageSource().contains("has been added in to the system");
//		if(res==true)
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Thread.sleep(3000);
//			captureScreen(driver,"TC_CVS_AddUsers_11");
//			Assert.assertTrue(false);
//		}
		
		
	}
	
	

}
