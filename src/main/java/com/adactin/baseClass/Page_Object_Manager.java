package com.adactin.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Login_Page lp;
	private SearchHotel_Page shp;
	private SelectHotel_Page stp;
	private BookHotel_Page bp;
	private LogOut_Page lop;
	
	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public Login_Page getLp() {
		lp= new Login_Page(driver);
		return lp;
	}
	public SearchHotel_Page getShp() {
		shp= new SearchHotel_Page(driver);
		return shp;
	}
	public SelectHotel_Page getStp() {
		stp= new SelectHotel_Page(driver);
		return stp;
	}
	public BookHotel_Page getBp() {
		bp = new BookHotel_Page(driver);
		return bp;
	}
	public LogOut_Page getLop() {
		lop = new LogOut_Page(driver);
		return lop;
	}
}
