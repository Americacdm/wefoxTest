package com.wfx.lego.it.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.wfx.lego.it.configuration.EnvironmentManager;
import com.wfx.lego.it.pages.cart.CartPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Cart {

	WebDriver driver;
	CartPage cartPage;

	@Before
	public void start() {
		driver = EnvironmentManager.getDriver();
		cartPage = new CartPage(driver);
	}

	@Given("I enter to lego page")
	public void i_enter_to_lego_page() {
		cartPage.iEnterToLegoPage();
		cartPage.isHomePageDisplayed();
	}

	@And("I search an specific article")
	public void i_search_an_specific_article() {
		cartPage.iSearchAnSpecificArticle();
	}

	@And("I verify that appears in the suggested result TextSuggestion element")
	public void i_verify_that_appears_in_the_suggested_result_TextSuggestion_element() {
		cartPage.iverifyThatAppearsInTheSuggestedResultTextSuggestionElement();
	}

	@When("I click on the suggested result")
	public void i_click_on_the_suggested_result() {
		cartPage.iClickOnTheSuggestedResult();
	}

	@And("I check that you are redirect to the item page")
	public void i_check_that_you_are_redirect_to_the_item_page() {
		cartPage.isiCheckThatYouAreRedirectToTheItemPageDisplayed();
	}

	@Then("I add in my cart")
	public void i_add_in_my_cart() {
		cartPage.iAddInMyCart();

	}

}
