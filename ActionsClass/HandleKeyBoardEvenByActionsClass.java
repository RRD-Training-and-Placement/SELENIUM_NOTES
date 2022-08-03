package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleKeyBoardEvenByActionsClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement username=driver.findElement(By.id("userName"));
		
		Actions  actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys(username,"a");
		actions.build().perform();
		actions.keyUp(Keys.SHIFT);
		actions.sendKeys(username,"lex");
		actions.build().perform();
		
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys(username," r");
		actions.build().perform();
		actions.keyUp(Keys.SHIFT);
		actions.sendKeys(username,"obin");
		actions.build().perform();
		
		// press Tab key
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("abc@gmail.com");
		actions.build().perform();
		
		//press tab key add current address in current address field
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("My Current Address is Lane number 101 House Number 5000 \n"
				+ "My Current Address is Lane number 101 House Number 5000");
		actions.build().perform();
		
		// select all data of current address
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//copy selected data
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		// pest data in perment address filed
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		
		
	}

}
