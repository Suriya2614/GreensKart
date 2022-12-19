package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedPom {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@style='width: 200px;']")
	private WebElement selectcountry;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement terms;

	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceed;

	public ProceedPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
