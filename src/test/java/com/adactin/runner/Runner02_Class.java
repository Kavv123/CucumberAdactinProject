package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.Base_Class;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith
//@CucumberOptions
//@BeforeClass
//@AfterClass

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
glue = "com.adactin.stepDefinition",
monochrome = true,
dryRun = false,
strict = true,
//tags = "@smokeTest",
plugin = {"html: Report/Html_Report",
		"pretty",
		"json: Report/Json_Report",
		"com.cucumber.listener.ExtentCucumberFormatter: Extent_Folder/Extent_Report.html"
})

public class Runner02_Class {
	
	public static WebDriver driver;   //null
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browser = File_Reader_Manager.getInstanceFR().getInstanceCR().getBrowser();
		
		driver = Base_Class.getBrowser(browser); //Either give getBrowser(browser) for hiding the key's particular value in configuration properties or use getBrowser("chrome") if not using configuration properties
		
	}
	
	@AfterClass
	public static void tearDown() {
		
		driver = Base_Class.close();
		
	}
}	
