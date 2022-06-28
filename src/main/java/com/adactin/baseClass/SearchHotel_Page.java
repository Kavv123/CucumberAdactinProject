package com.adactin.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")	
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement no_Of_Rooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkIn_Date;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOut_Date;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsPer_Room;
	
	@FindBy(id = "child_room")
	private WebElement childrenPer_Room;
	
	@FindBy(name = "Submit")
	private WebElement search_Btn;

	public SearchHotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this );
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNo_Of_Rooms() {
		return no_Of_Rooms;
	}

	public WebElement getCheckIn_Date() {
		return checkIn_Date;
	}

	public WebElement getCheckOut_Date() {
		return checkOut_Date;
	}

	public WebElement getAdultsPer_Room() {
		return adultsPer_Room;
	}

	public WebElement getChildrenPer_Room() {
		return childrenPer_Room;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}
}
