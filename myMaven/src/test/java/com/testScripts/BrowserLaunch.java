package com.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.packs.PathLocators;
import com.packs.PerformMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends PerformMethods {
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PathLocators.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterClass(alwaysRun = true)
	public void browserTearDown() {
		driver.quit();
	}
	

}
