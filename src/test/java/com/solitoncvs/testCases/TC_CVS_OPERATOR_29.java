package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.AddImageInputControl;
import com.solitoncvs.pageObjects.CreateNewBroadcast;
import com.solitoncvs.pageObjects.Loginpage;

public class TC_CVS_OPERATOR_29 extends BaseClass
{
	@Test
	public void imageInputControl() throws InterruptedException, IOException, FindFailed
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
		//System.out.println(driver.getTitle());
		Set <String> s=driver.getWindowHandles(); //get the id of the available windows/browsers
		logger.info("window switched");
		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		AddImageInputControl addImageInputControl=new AddImageInputControl(driver);
		addImageInputControl.clickImageInputControl();
		Thread.sleep(3000);
		addImageInputControl.imageAddButton();
		
		String imageFilePath="F:\\Soliton Frameworkdata\\Upload Images\\";
		String inputFilePath="F:\\Soliton Frameworkdata\\Upload Images\\";
		
		Screen s1= new Screen();
		
		Pattern fileNameInputTextbox = new Pattern(imageFilePath + "FilePath.PNG");
		Pattern openButton = new Pattern(imageFilePath + "Open.PNG");
		
		Thread.sleep(3000);
		s1.wait(fileNameInputTextbox,20);
		s1.type(fileNameInputTextbox,inputFilePath +"Tulips.jpg");
		s1.click(openButton);
		
		Thread.sleep(3000);
		addImageInputControl.clickImageUploadButton();
		
		boolean upload=driver.getPageSource().contains("Uploads");
		if(upload==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"TC_CVS_ImageInputControl_14");
			Assert.assertTrue(false);
		}
	}

}
