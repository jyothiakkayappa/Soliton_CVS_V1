package com.solitoncvs.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.solitoncvs.pageObjects.Loginpage;
import com.solitoncvs.utilities.XLUtils;

import junit.framework.Assert;

public class TC_CVS_LoginDDT_2 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String email,String pwd,String otp) throws InterruptedException, IOException
	{
		Loginpage lp =new Loginpage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.setOTP(otp);
		lp.clickSignIn();
		Thread.sleep(3000);
		logger.info("Validation started");
		boolean res=driver.getPageSource().contains("Incorrect Email or Password or OTP");
		if(res==true)
		{
			captureScreen(driver,"TC_CVS_LoginDDT_2");
			Assert.assertTrue(false);
			logger.info("Testcase Fail");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Testcase Pass");
		}

	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/solitoncvs/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1",1);
		
		String loginData[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}

}
