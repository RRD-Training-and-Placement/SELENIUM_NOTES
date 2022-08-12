package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrangeHrmPage {
	
	private WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement userNameTextbox;
	
	@FindBy(name="txtPassword")
	private WebElement passwordTextbox;
	
	@FindBy(className = "button")
	private WebElement loginButton;
	
	@FindBy(partialLinkText ="Forgot your password?")
	private WebElement forgotPasswordLink;
	
	public LoginOrangeHrmPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUserName(String username)
	{
		userNameTextbox.sendKeys(username);
	}
	public void setPassword(String password)
	{
		passwordTextbox.sendKeys(password);
	}
	public void clickOnLogin()
	{
		loginButton.click();
	}
    public void clickOnForgotPasswordLink()
    {
    	forgotPasswordLink.click();
    }
}
