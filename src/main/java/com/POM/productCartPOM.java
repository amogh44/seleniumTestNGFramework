package com.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productCartPOM {
 
	public WebDriver driver;

	private By Searchbox=By.xpath("//input[@value='Search store']");

	private By searchBtn=By.xpath("//input[@value='Search']");

	private By productTitle=By.xpath("//h2[@class='product-title']");

	private By processorradiobtn=By.xpath("//input[@id='product_attribute_75_5_31_96']");

	private By itemPrice=By.xpath("//span[@class='price actual-price']");

	private By addToCartBtn=By.xpath("(//input[@value='Add to cart'])[1]");

	private By popup=By.xpath("//p[@class='content']");

	private By shoppingCart=By.xpath("(//a[@class='ico-cart'])[1]");

	private By goToCart=By.xpath("//input[@value='Go to cart']");

	private By close=By.xpath("//span[@class='close']");

	private By total=By.xpath("//span[@class='product-price order-total']");

	public productCartPOM(WebDriver driver) {

		// TODO Auto-generated constructor stub

		this.driver=driver;

	}

	public WebElement Entretext() {

		return driver.findElement(Searchbox);

	}

	public WebElement search() {

		return driver.findElement(searchBtn);

	}

	public List<WebElement> productTitle() {

		return driver.findElements(productTitle);

	}

	public WebElement clickOnProcessorRadioBtn() {

		return driver.findElement(processorradiobtn);

	}

	public List<WebElement> priceBrforeCart() {

		return driver.findElements(itemPrice);

	}

	public WebElement clickOnAddToCartBtn() {

		return driver.findElement(addToCartBtn);

	}

	public WebElement getTextofPopup() {

		return driver.findElement(popup);

	}

	public WebElement hoverOnShoppingCart() {

		return driver.findElement(shoppingCart);

	}

	public WebElement clickOnGotoCArt() {

		return driver.findElement(goToCart);

	}

	public WebElement clickOnCLoseBtn() {

		return driver.findElement(close);

	}

	public WebElement getTextofTotal() {

		return driver.findElement(total);

	}


 
}

