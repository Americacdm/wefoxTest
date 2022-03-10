package com.wfx.lego.it.pages.cart;

/**
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wfx.lego.it.pages.BasePage;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static class Locators {
		private Locators() {
		}

		/** Lego URL */
		static String legoUrl = "https://www.lego.com/es-es";
		/** Lego home */
		static String legoHome = "blt11531a06e1886797";
		/** First cookie */
		static String cookie1 = "//*[@id=\"root\"]/div[5]/div/div/div[1]/div[1]/div/button";
		/** Second cookie */
		static String cookie2 = "/html/body/div[5]/div/aside/div/div/div[3]/div[1]/button[2]";
		/** Search button 1 */
		static String searchButton = "//*[@id=\"root\"]/div[2]/header/div[2]/div[2]/div/div[5]/div/button";
		/** Open search */
		static String openSearch = "desktop-search-search-input";
		/** Star wars article */
		static String bb8 = "BB-8";
		/** Suggested article */
		static String sugArticle = "//*[@id=\"desktop-search-search-suggestions\"]/li[2]";
		/** Element TextSuggestion */
		static String sugText = "TextSuggestion";
		/** Item Page */
		static String itemPage = "//*[@id=\"main-content\"]/div/ol/li[3]/span/span";
		/** Add to cart */
		static String addCart = "//*[@id=\"main-content\"]/div/div[1]/div/div[2]/div[5]/div[1]/div/div/div/button";

	}

	/** Home page Lego */
	public boolean iEnterToLegoPage() {
		visit(Locators.legoUrl);
		try {
			driver.findElement(By.id(Locators.legoHome));

			return true;
		} catch (final NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * check if Lego Home page is displayed
	 *
	 * @return true is displayed, false isn't.
	 */
	public boolean isHomePageDisplayed() {
		return isDisplayed(By.id(Locators.legoHome));

	}

	/** Article search */
	public void iSearchAnSpecificArticle() {

		final WebElement cookie1 = driver.findElement(By.xpath(Locators.cookie1));
		cookie1.click();

		final WebElement cookie2 = driver.findElement(By.xpath(Locators.cookie2));
		cookie2.click();

		final WebElement searchButton = driver.findElement(By.xpath(Locators.searchButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", searchButton);

	}

	/** List a Specific articles */
	public void iverifyThatAppearsInTheSuggestedResultTextSuggestionElement() {
		final WebElement openSearch = driver.findElement(By.id(Locators.openSearch));
		openSearch.sendKeys(Locators.bb8);
	}
	/** Find the element*/
	boolean TextSuggestionElement() {
		try {
			driver.findElement(By.id(Locators.sugText));

			return true;
		} catch (final NoSuchElementException e) {
			return false;
		}

	}

	/** Choose a specific article */
	public void iClickOnTheSuggestedResult() {
		final WebElement sugArticle = driver.findElement(By.xpath(Locators.sugArticle));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", sugArticle);

	}

	/** Specific article page */
	public boolean isiCheckThatYouAreRedirectToTheItemPageDisplayed() {
		return isDisplayed(By.xpath(Locators.itemPage));

	}

	/** Add to cart */
	public void iAddInMyCart() {
		final WebElement addCart = driver.findElement(By.xpath(Locators.addCart));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addCart);
	}
}
