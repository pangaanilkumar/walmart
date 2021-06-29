package com.walmart.genaric;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTestW {
		FilesLib fb=new FilesLib();
	
		
		public String getPageTitle() {
			String pageTitle= driver.getTitle();
			return pageTitle;
		}
		
		public void verify(String actual,String expected,String page) {
			Assert.assertEquals(actual,expected);
		}
	 	public void mouseHover(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		}
		
		public void selectOption(WebElement element,String text )
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);	
		}
		
		public void selectOption(String value,WebElement element)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
			
		}public void selectOption(WebElement element,int index )
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);	
		}
		
		
		public void switchToFrame(int index) {
			driver.switchTo().frame(index);
		}
			

		public void switchToFrame(String value) {
			driver.switchTo().frame(value);
		}
		

		public void switchToFrame(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public void getFullScreenshot(String path) throws Throwable
		{	
			
			TakesScreenshot	ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			Files.copy(src, dest);
		}
		public void getElementScreenshot(WebElement element, String path) throws Throwable
		{	

			TakesScreenshot	ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			Files.copy(src, dest);
		}

		public void waitForTitle(String title) {
			// TODO Auto-generated method stub
			
			WebDriverWait wait= new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(title));
		}

}
