package com.solitoncvs.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.CreateNewBroadcast;
import com.solitoncvs.pageObjects.Loginpage;

public class TC_CVS_Createbroadcast_3 extends BaseClass {
	
	@Test
	public void createBroadcast() throws InterruptedException 
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
		Thread.sleep(3000);
		createnewbroadcast.broadcasteName("ABC");
		logger.info("Broadcast name  Provided");
		createnewbroadcast.startBroadcast();
		Thread.sleep(3000);
		logger.info("Broadcast name  View");

		createnewbroadcast.viewBroadcast();
		logger.info("Broadcast name  View");
		
		
	}

}
