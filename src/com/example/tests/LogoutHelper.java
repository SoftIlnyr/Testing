package com.example.tests;

import org.openqa.selenium.By;

public class LogoutHelper extends HelperBase {
    public LogoutHelper(AppManager appManager) {
        super(appManager);
    }

    public void logOut() throws InterruptedException {
        appManager.driver.findElement(By.id("not1")).click();
        appManager.driver.findElement(By.xpath("//a/li/span")).click();
        Thread.sleep(1000);
    }
}
