package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelingPage {

	
	@FindBy(xpath="//button[text()='Start Selling']")
	WebElement startSellButton;
	
	
	public SelingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sellingButton() {
		startSellButton.click();
	}
}
