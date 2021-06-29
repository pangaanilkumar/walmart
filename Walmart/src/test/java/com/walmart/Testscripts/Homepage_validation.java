package com.walmart.Testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.walmart.genaric.BaseTestW;
import com.walmart.genaric.FilesLib;
import com.walmart.genaric.IAutoconstants;
import com.walmart.genaric.WebDriverCommonLib;
import com.walmart.pageObject.Home_Page;

public class Homepage_validation extends BaseTestW{
@Test 
public void Home_pages() throws Throwable {
	FilesLib fb=new FilesLib();
	String Search_Element=fb.readPropData(Prop_Path,"Search_Element");
	WebDriverCommonLib wb=new WebDriverCommonLib();
	Home_Page hp=new Home_Page();
	wb.verify(wb.getPageTitle(), fb.readPropData(Prop_Path,"Actual_title"),"HomePage Tilte Verification");
	Reporter.log("Page Title is Verified",true);
	//wb.getFullScreenshot(path);
	hp.Mainmenu();
	hp.ElectronicsM();
	hp.TVandVideosM();
	hp.TVslist();
	
	
	/*
	 * hp.text(Search_Element); hp.Sbox();
	 */
}
}
