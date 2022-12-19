package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckoutPom {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchvegetables;

	@FindBy(xpath = "//a[@class='increment']")
	private WebElement clickonqty;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement clickonaddtocart;

	@FindBy(xpath = "//a[@class='cart-icon']")
	private WebElement clickoncart;

	public ProceedToCheckoutPom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSearchvegetables() {
		return searchvegetables;
	}

	public WebElement getClickonqty() {
		return clickonqty;
	}

	public WebElement getClickonaddtocart() {
		return clickonaddtocart;
	}

	public WebElement getClickoncart() {
		return clickoncart;
	}

	public WebElement getClickonproceedtocheckout() {
		return clickonproceedtocheckout;
	}

	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement clickonproceedtocheckout;

}
