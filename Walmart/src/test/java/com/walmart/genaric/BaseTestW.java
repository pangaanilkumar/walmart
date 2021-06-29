package com.walmart.genaric;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestW  implements IAutoconstants {
	public static WebDriver driver;
	
@BeforeClass
public void Lunch_browser () throws Throwable 
{
	
		FilesLib fis=new FilesLib();
	String browser=fis.readPropData(Prop_Path,"browser");
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();   
	driver=new ChromeDriver();
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--star-maximize");
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();   
		WebDriver driver=new FirefoxDriver();
		FirefoxOptions n=new FirefoxOptions();
		n.addArguments("--star-maximize");
	}
	String appurl=fis.readPropData(Prop_Path, "url");
	driver.get(appurl);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
}

@AfterClass
public void tearDown() throws Throwable {
	Thread.sleep(15000);
	driver.close();
}

}


