package com.example.tests;

import org.openqa.selenium.By;

public class Temp {
    AppManager appManager = new AppManager();

    public void openMyNotes() throws InterruptedException {
        appManager.driver.findElement(By.xpath("//img[contains(@src,'https://png.icons8.com/windows/30/ffffff/note.png')]")).click();
        Thread.sleep(1000);
    }

    public void deleteLastNote() {
        appManager.driver.findElement(By.xpath("//img[contains(@src,'https://png.icons8.com/windows/20/666666/delete-sign.png')]")).click();
        appManager.driver.findElement(By.xpath("//span[@onclick=\"deletenew('1000');\"]")).click();
    }

    public void createComment(String text) {
        appManager.driver.findElement(By.xpath("//img[contains(@src,'https://png.icons8.com/metro/16/333333/topic.png')]")).click();
        appManager.driver.findElement(By.id("sendcomment")).clear();
        appManager.driver.findElement(By.id("sendcomment")).sendKeys(text);
        appManager.driver.findElement(By.name("commentsend")).click();
    }
}
