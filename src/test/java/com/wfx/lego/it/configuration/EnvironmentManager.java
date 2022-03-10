package com.wfx.lego.it.configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Obtains browser configurations.
 *
 * @author América Díaz
 *
 */
public class EnvironmentManager {

    public static WebDriver driver;

    public static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    /**
     * Obtains a valid driver for automation tests.
     *
     * @return a valid chromedriver.
     * @throws MalformedURLException
     */
    public static WebDriver getDriver() {

        if (driver == null) {
            final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            final ChromeOptions chromeOpt = new ChromeOptions();
            capabilities.setBrowserName("chrome");
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOpt);

            if (System.getProperty("os.name").startsWith("Wind")) {
                System.setProperty("webdriver.chrome.driver",
                        EnvironmentManager.class.getClassLoader().getResource("chromedriver.exe").getPath());
                driver = new ChromeDriver(chromeOpt);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            } else {
                try {
                    driver = new RemoteWebDriver(new URL(
                            "https://www.lego.com/es-e"),
                            capabilities);
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
                catch (final MalformedURLException e) {
                    driver = null;
                }
            }
        }
        return driver;
        
        

    }

}
