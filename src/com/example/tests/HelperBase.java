package com.example.tests;

import com.example.tests.entities.AccountData;
import org.openqa.selenium.*;

public abstract class HelperBase {

    protected AppManager appManager;

    public HelperBase(AppManager appManager) {
        this.appManager = appManager;
    }


    private boolean isElementPresent(By by) {
        try {
            appManager.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            appManager.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        boolean acceptNextAlert = true;
        try {
            Alert alert = appManager.driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


}
