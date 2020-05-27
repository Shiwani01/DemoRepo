package com.phptravel.qa.testcases;


import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravel.qa.base.TestBase;
import com.phptravel.qa.pages.HomePage;
import com.phptravel.qa.pages.LoginPage;

@Test
public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
      public void setUp() {
		initialization();
		 loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validatePageTitleTest() {
		String title=loginpage.validatePageTitle();
		Assert.assertEquals(title,"Login");
		System.out.println(title);
	}
	
	/*@Test(priority=2)
	public void validatePageLogo() {
		boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
	}*/
	
	@Test(priority=3)
	public void validateLogin() {
		homepage =loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
