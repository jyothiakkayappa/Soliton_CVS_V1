package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.Loginpage;
import com.solitoncvs.pageObjects.UserDropDown;

public class TC_CVS_OPERATOR_131 extends BaseClass
{
	@Test
	public void selectAllImage() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.getTitle();
	    //Now use a page object class (LoginPage.java) to access methods ,create an object
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
		Thread.sleep(3000);
		WebElement P1 = driver.findElement(By.xpath("//button[@class='h-dropbtn']"));
		WebElement P2 = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		Actions act = new Actions(driver);
		
		act.moveToElement(P1).moveToElement(P2).click().build().perform();
		
		Thread.sleep(3000);
		if( driver.getTitle().equals("Soliton - Settings"))
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
		
		UserDropDown userDropDown=new UserDropDown(driver);
		userDropDown.clickMyMedia();
		
		Thread.sleep(3000);
		userDropDown.clickSelectAllImage();
		
		boolean res1=driver.getPageSource().contains("image selected");
		
		if(res1==true)
		{
			Assert.assertTrue(true);
		}
		else if(res1==false)
		{
			Assert.assertTrue(false);
		}
	}

}
