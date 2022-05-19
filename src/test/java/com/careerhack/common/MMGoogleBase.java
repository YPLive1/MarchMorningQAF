package com.careerhack.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMGoogleBase {

	public WebDriver driver;
	
	
	public void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // we put time out default of 20 sec so the test will wait upto 20 sec incase the page takes to long to load.
		
		
		
	}
	
	public void closeBrowser()
	{
		driver.close();
		
	}
}
