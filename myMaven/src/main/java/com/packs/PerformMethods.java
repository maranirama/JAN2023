package com.packs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PerformMethods implements PathLocators 
{
	
	public void clickOn(WebElement element)
	{
		element.click();
	}
	public void selectOn(WebElement element)
	{
		Select s=new Select(element);
		
		
		s.selectByIndex(1);
	}
}
