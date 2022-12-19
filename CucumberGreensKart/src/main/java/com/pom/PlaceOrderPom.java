package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPom {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement promocode;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;

	public PlaceOrderPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPromocode() {
		return promocode;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPlaeorder() {
		return plaeorder;
	}

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement plaeorder;

}
