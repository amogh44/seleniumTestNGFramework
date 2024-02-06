package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.POM.loginPOM;
import com.resourses.baseClass;
import com.resourses.commonMethods;
import com.resourses.constants;


public class loginPage extends baseClass {

	
	@Test
	public void verifyValidLogin() throws IOException {
 
		

		loginPOM lPOM=new loginPOM(driver);

		lPOM.ClickOnLoginLink().click();

		lPOM.entreEmailID().sendKeys(email);

		lPOM.entrePassword().sendKeys(constants.Password);

		lPOM.clickOnLogin().click();
 
		commonMethods.handleAssertion(lPOM.validCred().getText(), constants.loginvalidexpectedtext);

	}

	@Test

	public void verifyInValidLogin() throws IOException {

		loginPOM lPOM=new loginPOM(driver);

		lPOM.ClickOnLoginLink().click();

		lPOM.entreEmailID().sendKeys(email);

		lPOM.entrePassword().sendKeys(constants.Invalidpassword);

		lPOM.clickOnLogin().click();
 
		commonMethods.handleAssertion(lPOM.InvalidCred().getText(), constants.logininvalidexpectedtext);

}

}

