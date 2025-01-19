package com.pages;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.HomePage;
import com.pages.SelingPage;

public class TestSelingpage extends Baseclass {

	
	HomePage hp = null;
	SelingPage sp = null;
	

	@BeforeSuite
	public void setUp() {
		initialization();
		reportInit();
	}
	
	
	@Test
	public void test02() {
	hp = new HomePage(driver);
	hp.homepageLogin();
	sp = new SelingPage(driver);
	sp.sellingButton();
	
	
}}