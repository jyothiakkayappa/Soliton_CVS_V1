package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.CreateNewBroadcast;
import com.solitoncvs.pageObjects.GoLiveWithoutAddingInputControl;
import com.solitoncvs.pageObjects.Loginpage;
import com.solitoncvs.pageObjects.OutputStreamControls;

public class TC_CVS_OPERATOR_77 extends BaseClass
{
	@Test
	public void startYoutubeOutPutStreamControl() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
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
		boolean res=driver.getPageSource().contains("Start a new broadcast");
		if(res)
		{
			captureScreen(driver,"TC_CVS_AddLiveInput_4");
			createnewbroadcast.broadcasteName("ABC");
			logger.info("Broadcast name  Provided");
			createnewbroadcast.startBroadcast();
			logger.info("Testcase pass");
			Thread.sleep(6000);
			createnewbroadcast.viewBroadcast();
		}
		else if(res==false)
		{
			//captureScreen(driver,"TC_CVS_AddLiveInput_4");
			createnewbroadcast.viewBroadcast();
			logger.info("Testcase pass");
			Thread.sleep(3000);
		}
		Set <String> s=driver.getWindowHandles(); //get the id of the available windows/browsers
		logger.info("window switched");
		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		GoLiveWithoutAddingInputControl goLiveWInputCtl = new GoLiveWithoutAddingInputControl(driver);
//		
//		goLiveWInputCtl.addLivewithoutPlaybtn();
		
		Thread.sleep(3000);
		OutputStreamControls outputStreamControls=new OutputStreamControls(driver);
		outputStreamControls.clickYouTubeStreamControl();
		outputStreamControls.clickStartYouTubeStreamControlBtn();
		
//		Thread.sleep(5000);
//		goLiveWInputCtl.endStream();
	}

}
