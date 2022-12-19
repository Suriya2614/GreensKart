package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public static WebDriver driver;

	private ProceedToCheckoutPom p1;
	private PlaceOrderPom p2;
	private ProceedPom p3;
	
	

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;

	}

	public ProceedToCheckoutPom getInstanceProceedToCheckoutPom() {

		p1 = new ProceedToCheckoutPom(driver);
		return p1;

	}
	
	public PlaceOrderPom getInstancePlaceOrderPom() {

		
		p2=new PlaceOrderPom(driver);
		return p2;
	}
	
	public ProceedPom getInstanceProceedPom() {

		p3=new ProceedPom(driver);
		return p3;
		
	}

}
