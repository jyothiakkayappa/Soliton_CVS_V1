package com.solitoncvs.testCases;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.AudioMixInputControl;
import com.solitoncvs.pageObjects.CreateNewBroadcast;
import com.solitoncvs.pageObjects.GoLiveWithoutAddingInputControl;
import com.solitoncvs.pageObjects.Loginpage;

public class TC_CVS_OPERATOR_61 extends BaseClass
{
	@Test
	public void audioMixRightDrag() throws InterruptedException, IOException
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
//		AudioMixInputControl audioMixInputControl=new AudioMixInputControl(driver);
//		audioMixInputControl.clickAudioMixInput();
//		
//		audioMixInputControl.clickAudioMixPlayBtn();
		
		WebElement slider = driver.findElement(By.xpath("//input[@id='myRange']"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 100, 0).build();
        action.perform();
		
		Thread.sleep(5000);
		//goLiveWInputCtl.endStream();
	}

}
