package com.adactin.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Logout']")
	
	private WebElement logOut_Btn;

	public LogOut_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogOut_Btn() {
		return logOut_Btn;
	}
}
