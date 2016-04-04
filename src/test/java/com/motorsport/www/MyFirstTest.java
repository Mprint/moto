package com.motorsport.www;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SBurlachenko on 31.03.2016.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should srat differ",
                             driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();

    }

}
