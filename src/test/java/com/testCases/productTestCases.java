package com.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.POM.productCartPOM;
import com.resourses.baseClass;
import com.resourses.commonMethods;
import com.resourses.constants;

public class productTestCases extends baseClass {
	@Test
	public void verifyProductPrice() throws IOException, InterruptedException {
 
		
		productCartPOM PPOM=new productCartPOM(driver);
		PPOM.Entretext().sendKeys(constants.product);
		PPOM.Entretext().sendKeys(Keys.ENTER);
		List<WebElement> productTitle= PPOM.productTitle();
		List<WebElement> price= PPOM.priceBrforeCart();
		String priceBeforeCart="";
		for(int i=0;i<productTitle.size();i++) {
			if(productTitle.get(i).getText().equalsIgnoreCase(constants.actualproductname)) {
				priceBeforeCart=price.get(i).getText();
				productTitle.get(i).click();
				break;
			}

		}
		PPOM.clickOnProcessorRadioBtn().click();
		PPOM.clickOnAddToCartBtn().click();
		commonMethods.handleExplicitWait(driver, 3, PPOM.clickOnCLoseBtn());
		PPOM.clickOnCLoseBtn().click();
		Actions a1=new Actions(driver);
		a1.moveToElement(PPOM.hoverOnShoppingCart()).perform();
		commonMethods.handleExplicitWait(driver, 1, PPOM.clickOnGotoCArt());
		PPOM.clickOnGotoCArt().click();
		commonMethods.handleAssertion(priceBeforeCart, PPOM.getTextofTotal().getText());



	}
 
}

