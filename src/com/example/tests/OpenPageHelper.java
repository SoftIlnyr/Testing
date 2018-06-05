package com.example.tests;

public class OpenPageHelper extends HelperBase{

    public OpenPageHelper(AppManager appManager) {
        super(appManager);
    }

    public void openPage(String path) throws InterruptedException {
        appManager.driver.get(path);
    }
}
