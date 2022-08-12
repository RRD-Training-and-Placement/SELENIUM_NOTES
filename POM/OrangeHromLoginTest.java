package com.page.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.LoginOrangeHrmPage;

public class OrangeHromLoginTest extends BaseTest{

	@Test
	public void loginOrangeHrm()
	{
		LoginOrangeHrmPage page=PageFactory.initElements(driver, LoginOrangeHrmPage.class);
		page.setUserName("Admin");
		page.setPassword("admin123");
		page.clickOnLogin();
		
	}
}
