package com.phptravel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravel.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//h3[@class='text-align-left']")
	WebElement userName;
	
	@FindBy(xpath="//span[@class='h4']")
	WebElement date;
	
	//@FindBy(xpath="")
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
