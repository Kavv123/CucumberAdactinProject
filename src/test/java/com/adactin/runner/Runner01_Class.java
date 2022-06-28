package com.adactin.runner;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.adactin.baseClass.Base_Class;
import com.adactin.baseClass.Page_Object_Manager;

public class Runner01_Class extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("Chrome");
	
	public static void main(String[] args) throws IOException {
		
		getUrl("https://adactinhotelapp.com/index.php");
		
		Page_Object_Manager pom = new Page_Object_Manager(driver);
		
		inputValueElement(pom.getLp().getUsername(), "Kavitha12");
		inputValueElement(pom.getLp().getPassword(), "HV6G96");
		clickOnElement(pom.getLp().getLogin_Btn());
		
		dropDown(pom.getShp().getLocation(), "byVisibleText", "Paris");
		dropDown(pom.getShp().getHotels(), "byVisibleText", "Hotel Sunshine");
		dropDown(pom.getShp().getRoom_Type(), "byVisibleText", "Super Deluxe");
		dropDown(pom.getShp().getNo_Of_Rooms(), "byVisibleText", "5 - Five");
		clear(pom.getShp().getCheckIn_Date());
		inputValueElement(pom.getShp().getCheckIn_Date(), "10/06/2022");
		clear(pom.getShp().getCheckOut_Date());
		inputValueElement(pom.getShp().getCheckOut_Date(), "12/06/2022");
		dropDown(pom.getShp().getAdultsPer_Room(), "byVisibleText", "2 - Two");
		dropDown(pom.getShp().getChildrenPer_Room(), "byVisibleText", "1 - One");
		clickOnElement(pom.getShp().getSearch_Btn());
		
		clickOnElement(pom.getStp().getRadio_Btn());
		clickOnElement(pom.getStp().getContinue_Btn());
		
		inputValueElement(pom.getBp().getFirst_Name(), "Kavitha");
		inputValueElement(pom.getBp().getLast_Name(), "Vishnu");
		inputValueElement(pom.getBp().getBilling_Address(), "Street: 94 Rose Street\r\n"
				+ "City: Berwick\r\n"
				+ "State/province/area: Victoria\r\n"
				+ "Zip code: 3806\r\n"
				+ "Country: Australia\r\n");
		inputValueElement(pom.getBp().getCreditCard_No(), "2222444466668888");
		dropDown(pom.getBp().getCreditCard_Type(), "byVisibleText", "American Express");
		dropDown(pom.getBp().getExpDate_Month(), "byVisibleText", "December");
		dropDown(pom.getBp().getExpDate_Year(), "byVisibleText", "2022");
		inputValueElement(pom.getBp().getCvv_No(), "987");
		clickOnElement(pom.getBp().getBookNow_Btn());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		implicitWait(2);
		screenShots("C:\\Users\\Win10\\eclipse-workspace\\Cucumber_Project\\ScreenShots//BookingConfirmation1.png");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript(("window.scrollTo(0, document.body.scrollHeight)"), "");
		clickOnElement(pom.getLop().getLogOut_Btn());
	}
}
