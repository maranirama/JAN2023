package com.pageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.packs.PerformMethods;

public class PageConstructor extends PerformMethods{
	
	public PageConstructor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	
	}


