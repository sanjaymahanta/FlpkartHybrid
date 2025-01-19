package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.Utilities.WaitUtils;

public class HomePageTest extends Baseclass{

	HomePage hp = null;
	
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		hp = new HomePage(driver);
		
	}
	@Test
	public void Test01() {
	hp.homepageLogin();
}
}