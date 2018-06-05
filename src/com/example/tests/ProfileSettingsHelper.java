package com.example.tests;

import org.openqa.selenium.By;

public class ProfileSettingsHelper extends HelperBase {
    public ProfileSettingsHelper(AppManager appManager) {
        super(appManager);
    }

    public void openProfileSettings() throws InterruptedException {
        appManager.driver.findElement(By.xpath("//a[@id='not1']/div")).click();
        appManager.driver.findElement(By.xpath("//li[@onclick=\"location.href='settings.php'\"]")).click();
        Thread.sleep(3000);
    }
}
