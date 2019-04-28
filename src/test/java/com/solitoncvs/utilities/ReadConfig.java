package com.solitoncvs.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is " +e.getMessage());
		}
		
	}
	
	//to get url from config.prperties file
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	//To get Email fron config.properties file
	public String getEmail()
	{
		String email = pro.getProperty("email");
		return email;
	}
	//To get password from config.properties
	public String getPassword()
	{
		String pw = pro.getProperty("password");
		return pw;
	}
	public String  getOTP()
	{
		String otp=pro.getProperty("otp");
		return otp;
		
	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEPath()
	{
		String IEpath = pro.getProperty("iepath");
		return IEpath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getLiveurl()
	{
		String getLiveurl=pro.getProperty("url");
		return getLiveurl;
	}
}

