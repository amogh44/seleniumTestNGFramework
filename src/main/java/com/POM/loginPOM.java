package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginPOM {

	public WebDriver driver;

	private By email=By.xpath("//inpu[@id='Email']");

	private By password=By.xpath("//input[@id='Password']");

	private By LoginBtn=By.xpath("//input[@class='button-1 login-button']");

	private By rememberMe=By.xpath("//input[@id='RememberMe']");

	private By forgotPassword=By.xpath("//span[@class='forgot-password']");

	private By loginLink=By.xpath("//a[@class='ico-login']");

	private By logOutText=By.xpath("//a[@class='ico-logout']");

	private By loginUnsuccessful=By.xpath("//div[@class='validation-summary-errors']/span");

 
	public loginPOM(WebDriver driver) {

		// TODO Auto-generated constructor stub

		this.driver=driver;

	}
 
	public WebElement entreEmailID() {

		return driver.findElement(email);

	}

	public WebElement entrePassword() {

		return driver.findElement(password);

	}

	public WebElement clickOnLogin() {

		return driver.findElement(LoginBtn);

	}

	public WebElement ClickOnLoginLink() {

		return driver.findElement(loginLink);

	}

	public WebElement validCred() {

		return driver.findElement(logOutText);

	}

	public WebElement InvalidCred() {

		return driver.findElement(loginUnsuccessful);

	}

	

 
}

