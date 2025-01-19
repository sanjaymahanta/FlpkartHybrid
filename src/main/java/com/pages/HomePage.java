package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.WaitUtils;

public class HomePage {

	

	   @FindBy(xpath="//a[text()='Become a Seller']")
	   WebElement seller;
	   
	   
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void homepageLogin() {
			WaitUtils.waitApplication();
			seller.click();
			
		}
}
