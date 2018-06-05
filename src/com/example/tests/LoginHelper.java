package com.example.tests;

import com.example.tests.entities.AccountData;
import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {
    public LoginHelper(AppManager appManager) {
        super(appManager);
    }

    public void logIn(String email, String password) throws InterruptedException {
        appManager.driver.findElement(By.id("input1")).click();
        appManager.driver.findElement(By.id("input1")).clear();
        appManager.driver.findElement(By.id("input1")).sendKeys(email);
        appManager.driver.findElement(By.id("input2")).clear();
        appManager.driver.findElement(By.id("input2")).sendKeys(password);
        appManager.driver.findElement(By.name("get")).click();
        Thread.sleep(1000);
    }

    public void logIn(AccountData accountData) throws InterruptedException {
        logIn(accountData.getEmail(), accountData.getPassword());
        Thread.sleep(3000);

    }
}
