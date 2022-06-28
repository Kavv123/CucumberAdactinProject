package com.adactin.runner;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.Base_Class;
import com.adactin.baseClass.BookHotel_Page;
import com.adactin.baseClass.LogOut_Page;
import com.adactin.baseClass.Login_Page;
import com.adactin.baseClass.SearchHotel_Page;
import com.adactin.baseClass.SelectHotel_Page;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("Chrome");
	
	public static Login_Page lp = new Login_Page(driver);
	public static SearchHotel_Page shp = new SearchHotel_Page(driver);
	public static SelectHotel_Page stp = new SelectHotel_Page(driver);
	public static BookHotel_Page bp = new BookHotel_Page(driver);
	public static LogOut_Page lop = new LogOut_Page(driver);
		
	public static void main(String[] args) throws IOException {
		
		getUrl("https://adactinhotelapp.com/index.php");
		
		inputValueElement(lp.getUsername(), "Kavitha12");
		inputValueElement(lp.getPassword(), "HV6G96");
		clickOnElement(lp.getLogin_Btn());
		
		dropDown(shp.getLocation(), "byVisibleText", "Paris");
		dropDown(shp.getHotels(), "byVisibleText", "Hotel Sunshine");
		dropDown(shp.getRoom_Type(), "byVisibleText", "Super Deluxe");
		dropDown(shp.getNo_Of_Rooms(), "byVisibleText", "5 - Five");
		clear(shp.getCheckIn_Date());
		inputValueElement(shp.getCheckIn_Date(), "10/06/2022");
		clear(shp.getCheckOut_Date());
		inputValueElement(shp.getCheckOut_Date(), "12/06/2022");
		dropDown(shp.getAdultsPer_Room(), "byVisibleText", "2 - Two");
		dropDown(shp.getChildrenPer_Room(), "byVisibleText", "1 - One");
		clickOnElement(shp.getSearch_Btn());
		
		clickOnElement(stp.getRadio_Btn());
		clickOnElement(stp.getContinue_Btn());
		
	//	scrollDown1(1, 150);
		inputValueElement(bp.getFirst_Name(), "Kavitha");
		inputValueElement(bp.getLast_Name(), "Vishnu");
		inputValueElement(bp.getBilling_Address(), "Street: 94 Rose Street\r\n"
				+ "City: Berwick\r\n"
				+ "State/province/area: Victoria\r\n"
				+ "Zip code: 3806\r\n"
				+ "Country: Australia\r\n");
		inputValueElement(bp.getCreditCard_No(), "2222444466668888");
		dropDown(bp.getCreditCard_Type(), "byVisibleText", "American Express");
		dropDown(bp.getExpDate_Month(), "byVisibleText", "December");
		dropDown(bp.getExpDate_Year(), "byVisibleText", "2022");
		inputValueElement(bp.getCvv_No(), "987");
		clickOnElement(bp.getBookNow_Btn());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		implicitWait(2000);
		screenShots("C:\\Users\\Win10\\eclipse-workspace\\Cucumber_Project\\ScreenShots//BookingConfirmation.png");
		clickOnElement(lop.getLogOut_Btn());
	}
}
