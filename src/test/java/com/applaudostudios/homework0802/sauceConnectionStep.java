package com.applaudostudios.homework0802;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class sauceConnectionStep {

    private WebDriver driver;
    private WebDriverWait wait;
    public static final int SECONDS = 10;

    @Before("@clickRadioButton")
    public void setUp(Scenario scenario) throws MalformedURLException {
        String username = "ccontrerasapplaudo";
        String accessKey = "ec8ca57e-b5cc-4cb7-80b5-4317c1e9c3ac";

        ChromeOptions chromeOptions = new ChromeOptions();

        MutableCapabilities sauceOpts = new MutableCapabilities();
        sauceOpts.setCapability("name",scenario.getName());
        sauceOpts.setCapability("username",username);
        sauceOpts.setCapability("accessKey",accessKey);

        MutableCapabilities browserOptions = new MutableCapabilities();
        browserOptions.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        browserOptions.setCapability("sauce:options",sauceOpts);
        browserOptions.setCapability("browserName","chrome");
        browserOptions.setCapability("browserVersion","latest");
        browserOptions.setCapability("platformName","windows 10");

        String sauceUrl = "https://ondemand.saucelabs.com:443/wd/hub";
        URL url = new URL(sauceUrl);
        driver = new RemoteWebDriver(url,browserOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(SECONDS));
    }

}
