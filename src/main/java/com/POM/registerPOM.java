package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPOM {

	public WebDriver driver; //this driver is null

	private By register=By.xpath("//a[@class='ico-register']");

	private By gender= By.xpath("//input[@value='M']");

	private By FirstName=By.xpath("//input[@name='FirstName']");

	private By LastName=By.xpath("//input[@name='LastName']");

	private By email=By.xpath("//input[@name='Email']");

	private By password=By.xpath("//input[@name='Password']");

	private By Cpassword=By.xpath("//input[@name='ConfirmPassword']");

	private By Regbtn=By.xpath("//input[@id='register-button']");

	private By regCompleted=By.xpath("//div[@class='result']");

	private By passError=By.xpath("//span[@for]");


	public registerPOM(WebDriver driver) {

		// TODO Auto-generated constructor stub

		this.driver=driver;

	}
 
	public WebElement clickOnRegister() {

		 return  driver.findElement(register);

	}

	public WebElement selectGender() {

		 return  driver.findElement(gender);

	}

	public WebElement entreFirstName() {

		 return  driver.findElement(FirstName);

	}

	public WebElement entreLastName() {

		 return  driver.findElement(LastName);

	}

	public WebElement entreEmail() {

		 return  driver.findElement(email);

	}


	public WebElement entrePassword() {

		 return  driver.findElement(password);

	}

	public WebElement entreCpassword() {

		 return  driver.findElement(Cpassword);

	}

	public WebElement clickOnRegisterButton() {

		 return  driver.findElement(Regbtn);

	}

	public WebElement successText() {

		 return  driver.findElement(regCompleted);

	}

	public WebElement passError() {

		 return  driver.findElement(passError);

	}


 
}

