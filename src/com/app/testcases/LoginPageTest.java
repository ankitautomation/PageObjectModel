package com.app.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.BaseClass;
import com.app.pages.DashboardPage;
import com.app.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage loginpg;
	DashboardPage obj_dashboardpg;
	
	@BeforeMethod
	public void setUp()
	{
		init();
		loginpg = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void verify_loginpageTitle()
	{
		String expected_title = "Administator Login";
		String actual_titlle = loginpg.validateLoginPageTitle();
		Assert.assertEquals(actual_titlle, expected_title);
	}
	
	@Test(priority=2)
	public void verify_loginFunction()
	{
		obj_dashboardpg = loginpg.loginFunction("admin@phptravels.com", "demoadmin");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
