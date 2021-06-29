package com.walmart.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.walmart.genaric.BaseTestW;
import com.walmart.genaric.FilesLib;

public class Home_Page extends BaseTestW{
	FilesLib fb=new FilesLib();
	public Home_Page() {
		PageFactory.initElements(BaseTestW.driver, this);
	}
	
@FindBy(id="global-search-input") private WebElement searchbox;

@FindBy(id="global-search-submit") private WebElement Sbox;

@FindBy(xpath="//button[@id=\"header-Header-sparkButton\"]//span[@class=\"g_b\"]") private WebElement MainMenu;
	
@FindBy(xpath="//div[@data-tl-id=\"header-departments\"]//span[@class=\"b_a b_g b_t\"]/span[text()=\"Electronics & Office\"]") private WebElement Electronics;

@FindBy(xpath="//span[text()=\"TV & Video\"]") private WebElement TVandVideos;

@FindBy() private WebElement TVsList;
public WebElement getSearchbox() {
	return searchbox;
}


public WebElement getSbox() {
	return Sbox;
}

public WebElement getMainMenu() {
	return MainMenu;
}

public WebElement getElectronics() {
	return Electronics;
}

public WebElement getTVandVideos() {
	return TVandVideos;
}

public WebElement getTVsList() {
	return TVsList;
}

public void Mainmenu() {
	MainMenu.click();
}
public void ElectronicsM() {
	Electronics.click();
}
public void TVandVideosM() {
	TVandVideos.click();
}
public void TVslist() {
	TVsList.click();
}














/*
 * public String text(String Search_Elements) {
 * searchbox.sendKeys(Search_Elements); return Search_Elements; } public void
 * Sbox() { Sbox.click(); }
 */
}
