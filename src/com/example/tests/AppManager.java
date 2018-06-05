package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AppManager {
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();
    protected LoginHelper loginHelper = new LoginHelper(this);
    protected LogoutHelper logoutHelper = new LogoutHelper(this);
    protected OpenPageHelper openPageHelper = new OpenPageHelper(this);
    protected ProfileSettingsHelper profileSettingsHelper = new ProfileSettingsHelper(this);
    protected TimezoneHelper timezoneHelper = new TimezoneHelper(this);
    protected CreateNoteHelper createNoteHelper = new CreateNoteHelper(this);

    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "c:\\Ilnyr\\Programs\\libraries\\geckodriver-v0.20.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
