package com.adactin.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	
	private WebElement radio_Btn;
	
	@FindBy(id = "continue")
	
	private WebElement continue_Btn;

	public SelectHotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

}
