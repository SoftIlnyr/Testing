package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimezoneHelper extends HelperBase {
    public TimezoneHelper(AppManager appManager) {
        super(appManager);
    }

    public void changeTimezone(int timezone_value) throws InterruptedException {
        WebElement webElement = appManager.driver.findElement(By.xpath("//option[@value='" + timezone_value + "']"));
        webElement.click();
        Thread.sleep(3000);
    }
}
