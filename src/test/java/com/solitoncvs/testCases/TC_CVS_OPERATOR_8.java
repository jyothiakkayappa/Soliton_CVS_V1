package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.Loginpage;
import com.solitoncvs.pageObjects.UserDropDown;

public class TC_CVS_OPERATOR_8 extends BaseClass
{
	@Test
	public void viewFullHistoryOnDashBoardPage() throws InterruptedException, IOException
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
		
		UserDropDown userDropDown=new UserDropDown(driver);
		userDropDown.clickViewFullHistory();	

	}

}
