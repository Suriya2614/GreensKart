package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User to launch the url")
	public void user_to_launch_the_url() throws InterruptedException {

//		url("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("User to search vegetables in the search box")
	public void user_to_search_vegetables_in_the_search_box() throws InterruptedException {

		pom.getInstanceProceedToCheckoutPom().getSearchvegetables().sendKeys("carrot");
	}

	@When("User to click the quantity of vegetable")

	public void user_to_click_the_quantity_of_vegetable() throws InterruptedException {

		Thread.sleep(3000);
		pom.getInstanceProceedToCheckoutPom().getClickonqty().click();
	}

	@When("User to click on the add to cart of the vegetable")
	public void user_to_click_on_the_add_to_cart_of_the_vegetable() {

		pom.getInstanceProceedToCheckoutPom().getClickonaddtocart().click();
	}

	@When("User to click on add to cart")
	public void user_to_click_on_add_to_cart() {

		pom.getInstanceProceedToCheckoutPom().getClickoncart().click();
	}

	@When("User to click on proceed to checkout")
	public void user_to_click_on_proceed_to_checkout() {

		pom.getInstanceProceedToCheckoutPom().getClickonproceedtocheckout().click();
	}

	@When("User to give the promocode values")
	public void user_to_give_the_promocode_values() throws InterruptedException {
		Thread.sleep(3000);
		pom.getInstancePlaceOrderPom().getPromocode().sendKeys("12345");
	}

	@When("User to click the apply")
	public void user_to_click_the_apply() {

		pom.getInstancePlaceOrderPom().getApply().click();
	}

	@When("User to click the proceed")
	public void user_to_click_the_proceed() {

		pom.getInstancePlaceOrderPom().getPlaeorder().click();
	}

	@When("User to select country")
	public void user_to_select_country() {

		selectdropdown(pom.getInstanceProceedPom().getSelectcountry(), "selectbyvisibletext", "Andorra");

	}

	@When("User to click check button in terms and conditions")
	public void user_to_click_check_button_in_terms_and_conditions() {

		pom.getInstanceProceedPom().getTerms().click();

	}

	@When("User to click Proceed")
	public void user_to_click_proceed() {

		pom.getInstanceProceedPom().getProceed().click();

	}

}
