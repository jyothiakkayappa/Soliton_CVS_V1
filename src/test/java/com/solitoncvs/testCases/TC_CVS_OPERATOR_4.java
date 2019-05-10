package com.solitoncvs.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.CreateNewBroadcast;
import com.solitoncvs.pageObjects.Loginpage;

public class TC_CVS_OPERATOR_4 extends BaseClass
{
	@Test
	public void startBroadcast() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Loginpage lp =new Loginpage(driver);
		lp.setEmail(email);
		logger.info("Email Provided");
		lp.setPassword(password);
		logger.info("password Provided");
		lp.setOTP(otp);
		logger.info("OTP Provided");
		lp.clickSignIn();
		
		Thread.sleep(3000);
		
		CreateNewBroadcast createnewbroadcast = new CreateNewBroadcast(driver);
		createnewbroadcast.broadcasteName("ABC");
		logger.info("Broadcast name  Provided");
		createnewbroadcast.startBroadcast();
		Thread.sleep(4000);
		createnewbroadcast.clickshutdown();
		
	}

}
