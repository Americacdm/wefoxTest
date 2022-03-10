package com.wfx.lego.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Selenium step base class.
 *
 * @author america diaz
 *
 */
public abstract class BasePage {
    protected final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * call findElement method
     *
     * @param locator
     * @return
     */
    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Text and input
     *
     * @param inputText
     * @param locator
     */
    protected void type(By locator, String inputText) {
        driver.findElement(locator).sendKeys(inputText);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * @param locator
     * @return true or false
     */
    protected boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    /**
     * Opens an url given.
     *
     * @param url
     *            the url to open.
     */
    protected void visit(String url) {
        driver.get(url);
    }

    /**
     * Expands Shadow Doms.
     *
     * @param element
     *            the element to expand.
     * @return
     */
    protected WebElement expandRootElement(WebElement element) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", element);
    }

}
