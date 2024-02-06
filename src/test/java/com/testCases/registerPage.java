package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.POM.registerPOM;
import com.resourses.baseClass;
import com.resourses.commonMethods;
import com.resourses.constants;


public class registerPage extends baseClass{
 
	
	@Test
	public void verifyValidRegistration() throws IOException {

		registerPOM rPom=new registerPOM(driver);
		rPom.clickOnRegister().click();
		rPom.selectGender().click();
		rPom.entreFirstName().sendKeys(constants.FirstName);
		rPom.entreLastName().sendKeys(constants.LastName);
		rPom.entreEmail().sendKeys(email);
		rPom.entrePassword().sendKeys(constants.Password);
		rPom.entreCpassword().sendKeys(constants.Cpassword);
		rPom.clickOnRegisterButton().click();
		commonMethods.handleAssertion(rPom.successText().getText(), constants.registervalidexpectedtext);

	}
	@Test
	public void verifyInvalidRegistration() throws IOException {
 
		
		registerPOM rPom=new registerPOM(driver);
		rPom.clickOnRegister().click();
		rPom.selectGender().click();
		rPom.entreFirstName().sendKeys(constants.FirstName);
		rPom.entreLastName().sendKeys(constants.LastName);
		rPom.entreEmail().sendKeys(email);
		rPom.entrePassword().sendKeys(constants.Invalidpassword);
		rPom.entreCpassword().sendKeys(constants.Invalidpassword);
		rPom.clickOnRegisterButton().click();
		commonMethods.handleAssertion(rPom.passError().getText(), constants.registerinvalidexpectedtext);

	}
 
}