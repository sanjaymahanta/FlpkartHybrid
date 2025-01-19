package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.Baseclass;

public class DriverUtils extends Baseclass {

	public static String  getScreenshot(String name) {
		
		String path = System.getProperty("user.dir")+"/Screenshot/"+name+".jpg";
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
	}
	
	
}
