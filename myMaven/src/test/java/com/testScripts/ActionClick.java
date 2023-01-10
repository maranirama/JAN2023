package com.testScripts;

import org.testng.annotations.Test;

import com.pageObjMod.Demo;

public class ActionClick extends BrowserLaunch {
	Demo f;

	@Test
	public void clickReg() {
		f = new Demo(driver);
		f.register();
	}

	@Test

	public void clickBooks() {
		f = new Demo(driver);
		f.clickOnBook();

		f.selectOnList();
	}

	@Test
	public void clickComputer() {
		f = new Demo(driver);
		f.clickOnComputer();
	}

	@Test
	public void clickItemOne() throws InterruptedException {
		f = new Demo(driver);
		f.itemOne();
		
	}	
	@Test
	public void compTest() 
	{
		f = new Demo(driver);
		
		f.itemOne();
		
	    f.clickOnCart();
	
		f.clickremoveItem();
		
	}
	
	@Test
	public void checkOutItem() 
	{
		f = new Demo(driver);
		
		f.itemOne();
		
	    f.clickOnCart();
	
		f.clickremoveItem();
		
		f.clickTerms();
		
		f.clickCheckOut();
		
	}

	}

	
	 