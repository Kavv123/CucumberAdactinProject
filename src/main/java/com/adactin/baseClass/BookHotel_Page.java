package com.adactin.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_Name;
	
	@FindBy(name = "last_name")
	private WebElement last_Name;
	
	@FindBy(name = "address")
	private WebElement billing_Address;
	
	@FindBy(name = "cc_num")
	private WebElement creditCard_No;
	
	@FindBy(name = "cc_type")
	private WebElement creditCard_Type;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expDate_Month;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expDate_Year;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv_No;
	
	@FindBy(xpath = "//input[@type='button'][1]")
	private WebElement bookNow_Btn;

	public BookHotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCreditCard_No() {
		return creditCard_No;
	}

	public WebElement getCreditCard_Type() {
		return creditCard_Type;
	}

	public WebElement getExpDate_Month() {
		return expDate_Month;
	}

	public WebElement getExpDate_Year() {
		return expDate_Year;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}

	public WebElement getBookNow_Btn() {
		return bookNow_Btn;
	}
}
