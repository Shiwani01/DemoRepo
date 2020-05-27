package com.phptravel.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravel.qa.base.TestBase;


public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement emailAddress;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
	WebElement loginbtn;

	@FindBy(xpath = "//div[@class='header-logo go-right']//a//img]")
	WebElement logo;

	/*@FindBy(xpath = "//label[@class='checkbox']")
	WebElement rememberme;

	@FindBy(xpath = "//strong[contains(test(),'Forget Password')]")
	WebElement forgetpassword;
*/
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String url,String ps) {
		emailAddress.sendKeys(url);
		password.sendKeys(ps);
		loginbtn.click();
		
		return new HomePage();
		
		
	}

	
	

}
