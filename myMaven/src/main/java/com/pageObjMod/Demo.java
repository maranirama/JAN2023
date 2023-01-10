package com.pageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demo extends PageConstructor
{
	
	public Demo(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(className="ico-register")
	WebElement reg;
	
	public void register()
	{
		clickOn(reg);
	}
	@FindBy(linkText="Books")
	WebElement book;
	
	public void clickOnBook()
	{
		clickOn(book);
	}
	
	@FindBy(id="products-orderby")
	WebElement list1;
	
	public void selectOnList()
	{
		selectOn(list1);
	}
	
	@FindBy(linkText="Computers")
	WebElement computer;
	
	public void clickOnComputer()
	{
		clickOn(computer);
		//selectOn(computer);
	}
	
	@FindBy(xpath="(//a[@href=\"/141-inch-laptop\"])[2]/../../..//input[@class='button-2 product-box-add-to-cart-button']")
	WebElement item1;
	
	public void itemOne()
	{
		clickOn(item1);
	}
	@FindBy(xpath="//a[@class='ico-cart']")
	WebElement shoppingCart;
	
	public void clickOnCart()
	{
		clickOn(shoppingCart);
		
	}
	@FindBy (xpath="//input[@name='termsofservice']")
	WebElement terms;

	public void clickTerms()
	{
		clickOn(terms);
		
	
		
	}
	
	@FindBy (id="checkout")
	WebElement checkOut;

	public void clickCheckOut()
	{
		clickOn(checkOut);
		
	
		
	}
	
	@FindBy (xpath="//input[@name='removefromcart']")
	WebElement removeItem;

	public void clickremoveItem()
	{
		clickOn(removeItem);
		
	
		
	}
}
