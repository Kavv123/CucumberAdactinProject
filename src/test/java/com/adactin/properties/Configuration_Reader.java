package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws IOException {
		
		File f = new File (
				"C:\\Users\\Win10\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {	
		String browser = p.getProperty("browser");
		return browser;
	}	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}