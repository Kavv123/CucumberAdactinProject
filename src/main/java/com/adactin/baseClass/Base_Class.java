package com.adactin.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;    //null  Eg: int a----> Declaration
	
	public static String value;
	
	public static WebDriver getBrowser(String type) {
		
		if(type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();  // Upcasting     Eg: a=10;  -----> Initialization
		}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\\\Driver\\\\chromedriver.exe");
			
			driver = new FirefoxDriver();  //Upcasting	
		}
		driver.manage().window().maximize();
		return driver;
		}
	
		public static void getUrl(String url) {
			driver.get(url);
			}
		public static void inputValueElement(WebElement element, String value) {
			element.sendKeys(value);
		}
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		
		public static void dropDown (WebElement element, String type, String value) {
			Select s = new Select(element);
			
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("byIndex")) {
				int data = Integer.parseInt(value);
				s.selectByIndex(data);
			}
			else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
		}
		public static void clear(WebElement element) {
			element.clear();	
		}
		public static void navigateTo(String url) {
			driver.navigate().to(url);
		}
		public static void navigateBack() {
			driver.navigate().back();
		}
		public static void navigateForward() {
			driver.navigate().forward();
		}
		public static void navigateRefresh() {
			driver.navigate().refresh();
		}
		
		public static WebDriver alertBox() {
			Alert x  = driver.switchTo().alert();
			x.accept();
			return driver;
		}
		public static void frameBox(String type, int frameIndex) {
			if (type.equalsIgnoreCase("enter")) {
				driver.switchTo().frame(frameIndex);
			}
			else if (type.equalsIgnoreCase("exit")) {
				driver.switchTo().defaultContent();
			}
		}
		
		public static void implicitWait(int s) {
			if (s >=1) {
			driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
			}
			else {
				System.out.println("This shows an error");
			}
		}
		
		public static void getTitle(String expectedTitle, String actualTitle) {
			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Verification successful - Correct Title is displayed");
			}
			else {
				System.out.println("Verification failed - Incorrect Title is displayed");
			}
		}
		public static void isEnabled(WebElement element) {
			if (element.isEnabled()) {
				System.out.println("Search Box is enabled.");
			}
			else {
				System.out.println("Search Box is disabled");
			}
		}
		
		public static void moveToElement(WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
		}
		
		public static void clickActions(WebElement element) {
			Actions act1 = new Actions(driver);
			act1.click(element).build().perform();
		}
		
		public static void pageDown() throws AWTException {
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_PAGE_DOWN);
			robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		
		public static void screenShots(String path) throws IOException {
			TakesScreenshot proceedToCheckout = (TakesScreenshot) driver;
			File s = proceedToCheckout.getScreenshotAs(OutputType.FILE);
			File d = new File(path);
			FileHandler.copy(s, d);
		}
		
		public static void scrollDown1(int x, int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(x, y)", "");
		}
		
		public static void scrollDown3() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript(("window.scrollTo(0, document.body.scrollHeight)"), "");
		}
		
		public static WebDriver close() {
			driver.close();
			return driver;
		}
		public static void quit() {
			driver.quit();
		}
}