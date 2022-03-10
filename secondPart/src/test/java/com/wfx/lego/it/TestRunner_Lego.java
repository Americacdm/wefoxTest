package com.wfx.lego.it;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.wfx.lego.it.configuration.EnvironmentManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Cucumber runner for the steps.
 *
 * @author América Díaz
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.wfx.lego.it.stepDefinitions" }, plugin = {
		"pretty", "html:target/cucumber-reports", }, monochrome = true)
public class TestRunner_Lego {


	/**
	 * Quits the driver.
	 */
	@AfterClass
	public static void teardown() {
		final WebDriver driver = EnvironmentManager.driver;
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
