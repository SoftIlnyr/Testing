package com.example.tests;

import com.example.tests.entities.TopicData;
import org.openqa.selenium.By;

public class CreateNoteHelper extends HelperBase {
    public CreateNoteHelper(AppManager appManager) {
        super(appManager);
    }

    public void createNote(String title, String text) throws InterruptedException {
        appManager.driver.findElement(By.xpath("//img[contains(@src,'https://png.icons8.com/windows/30/ffffff/plus-math.png')]")).click();
        appManager.driver.findElement(By.name("name")).click();
        appManager.driver.findElement(By.name("name")).clear();
        appManager.driver.findElement(By.name("name")).sendKeys(title);
//        driver.findElement(By.className("sod")).sendKeys(text);
        // ERROR: Caught exception [unknown command [editContent]]
        appManager.driver.findElement(By.id("makenote")).click();

        Thread.sleep(1000);
    }


    public void createNote(TopicData topicData) throws InterruptedException {
        createNote(topicData.getTitle(), topicData.getText());
    }
}
