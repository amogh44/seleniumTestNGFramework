package com.resourses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleAssertion(String actualText,String expectedText) {
		SoftAssert sa1=new SoftAssert();
		sa1.assertEquals(actualText, expectedText);
		
	}
	
	public static void handleExplicitWait(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
