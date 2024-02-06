package com.resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	public static WebDriver driver;
	public Properties prop;
	
	public static String email=randomEmailId();
	
	public void initilizeDriver() throws IOException {
		//read the file
		FileInputStream fis= new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\com\\resourses\\Data.properties");
		
		//access the content from prop files
		
		prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("pls choose correct browser");
		}
	}
	
	//To take the screenshot and store in one folder-
	  public static String screenShot(WebDriver driver, String filename) {
	   String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	                                                   //  202312120744
	   
	   TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	   File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	   String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateName + ".png";
	   File finalDestination = new File(destination);
	   try {
	    FileUtils.copyFile(source, finalDestination);
	   } catch (Exception e) {
	    e.getMessage();
	   }
	   return destination;
	  }

	
	public static String randomEmailId() {
		return "abc"+System.currentTimeMillis()+"@gmail.com";
	}
	
	 @BeforeSuite
	 public void ExtentReport() {
	  extentManager.setup();
	 }
	 
	 @AfterSuite
	 public void endReport() {
	  extentManager.endReport();
	 }

	 
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	
}
