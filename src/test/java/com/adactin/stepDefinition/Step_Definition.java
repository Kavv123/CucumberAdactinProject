package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.Base_Class;
import com.adactin.baseClass.Page_Object_Manager;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Runner02_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	
	  WebDriver driver = Runner02_Class.driver;
	
	  Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
				
		String url = File_Reader_Manager.getInstanceFR().getInstanceCR().getUrl();
		getUrl(url);  //Either give url(key) or value which is "https://adactinhotelapp.com/" but inorder to hide value we have to give key and hide value in configuration properties for private or confidential purpose.
		
//   	getUrl("https://adactinhotelapp.com/");
	}

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
////		String username = File_Reader_Manager.getInstanceFR().getInstanceCR().getUsername();
//		inputValueElement(pom.getLp().getUsername(), username);	/*In coding or scripting you can't see any username or password because we have kept them in configuration properties. We only give key here and hiding the value in configuration properties for private purpose. We have lot of confidential properties like Card number, CVV etc */
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
////		String password = File_Reader_Manager.getInstanceFR().getInstanceCR().getPassword();
//		inputValueElement(pom.getLp().getPassword(), password);
//	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		inputValueElement(pom.getLp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputValueElement(pom.getLp().getPassword(), password);
	}


	@Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getLp().getLogin_Btn());
	}

	@When("^user Select The Required Location In Location Option$")
	public void user_Select_The_Required_Location_In_Location_Option() throws Throwable {
		dropDown(pom.getShp().getLocation(), "byVisibleText", "Paris");
	}

	@When("^user Select The Required Hotels In Hotels Option$")
	public void user_Select_The_Required_Hotels_In_Hotels_Option() throws Throwable {
		dropDown(pom.getShp().getHotels(), "byVisibleText", "Hotel Sunshine");
	}

	@When("^user Select The Required Room Type In Room Type Option$")
	public void user_Select_The_Required_Room_Type_In_Room_Type_Option() throws Throwable {
		dropDown(pom.getShp().getRoom_Type(), "byVisibleText", "Super Deluxe");
	}

	@When("^user Select The Required Number Of Rooms In Number Of Rooms Option$")
	public void user_Select_The_Required_Number_Of_Rooms_In_Number_Of_Rooms_Option() throws Throwable {
		dropDown(pom.getShp().getNo_Of_Rooms(), "byVisibleText", "5 - Five");
	}

	@When("^user Clear The Default Date And Enter The Valid Check In Date In Check In Date Field$")
	public void user_Clear_The_Default_Date_And_Enter_The_Valid_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		clear(pom.getShp().getCheckIn_Date());
		inputValueElement(pom.getShp().getCheckIn_Date(), "10/06/2022");
	}

	@When("^user Clear The Default Date And Enter The Valid Check Out Date In Check Out Date Field$")
	public void user_Clear_The_Default_Date_And_Enter_The_Valid_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		clear(pom.getShp().getCheckOut_Date());
		inputValueElement(pom.getShp().getCheckOut_Date(), "12/06/2022");
	}

	@When("^user Select The Required Adults Per Room In Adults Per Room Option$")
	public void user_Select_The_Required_Adults_Per_Room_In_Adults_Per_Room_Option() throws Throwable {
		dropDown(pom.getShp().getAdultsPer_Room(), "byVisibleText", "2 - Two");
	}

	@When("^user Select The Required Children Per Room In Children Per Room Option$")
	public void user_Select_The_Required_Children_Per_Room_In_Children_Per_Room_Option() throws Throwable {
		dropDown(pom.getShp().getChildrenPer_Room(), "byVisibleText", "1 - One");
	}

	@Then("^user Click The Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getShp().getSearch_Btn());
	}

	@When("^user Select The Particular Hotel By Clicking The Required Radio Button$")
	public void user_Select_The_Particular_Hotel_By_Clicking_The_Required_Radio_Button() throws Throwable {
		clickOnElement(pom.getStp().getRadio_Btn());
	}

	@Then("^user Click The Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.getStp().getContinue_Btn());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		inputValueElement(pom.getBp().getFirst_Name(), "Kavitha");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		inputValueElement(pom.getBp().getLast_Name(), "Vishnu");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		inputValueElement(pom.getBp().getBilling_Address(), "Street: 94 Rose Street\r\n"
				+ "City: Berwick\r\n"
				+ "State/province/area: Victoria\r\n"
				+ "Zip code: 3806\r\n"
				+ "Country: Australia\r\n");
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
		inputValueElement(pom.getBp().getCreditCard_No(), "2222444466668888");
	}

	@When("^user Select The Valid Credit Card Type In Credit Card Type Option$")
	public void user_Select_The_Valid_Credit_Card_Type_In_Credit_Card_Type_Option() throws Throwable {
		dropDown(pom.getBp().getCreditCard_Type(), "byVisibleText", "American Express");
	}

	@When("^user Select The Valid Expiry Date In Select Month Option$")
	public void user_Select_The_Valid_Expiry_Date_In_Select_Month_Option() throws Throwable {
		dropDown(pom.getBp().getExpDate_Month(), "byVisibleText", "December");
	}

	@When("^user Select The Valid Expiry Date In Select Year Option$")
	public void user_Select_The_Valid_Expiry_Date_In_Select_Year_Option() throws Throwable {
		dropDown(pom.getBp().getExpDate_Year(), "byVisibleText", "2022");
	}

	@When("^user Enter The Correct CVV Number In CVV Number Field$")
	public void user_Enter_The_Correct_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFR().getInstanceCR().getCvv();
		inputValueElement(pom.getBp().getCvv_No(), cvv);
	}

	@Then("^user Clicks The Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Clicks_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getBp().getBookNow_Btn());
	}

	@Then("^user Click The Log Out Button And It Navigate To Another Page And It Display Message As \"([^\"]*)\"$")
	public void user_Click_The_Log_Out_Button_And_It_Navigate_To_Another_Page_And_It_Display_Message_As(String arg1) throws Throwable {
		clickOnElement(pom.getLop().getLogOut_Btn());
	}
}
