package com.example.tests;

import com.example.tests.entities.AccountData;
import com.example.tests.entities.TopicData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase {

    AppManager appManager = new AppManager();
    AccountData accountData = new AccountData("softilnyr@yandex.ru", "soft160896");
    TopicData topicData = new TopicData("Test case 02", "Hell");
    int timezone = 10;


    @Before
    public void setUp() throws Exception {
        appManager.setUp();
        appManager.openPageHelper.openPage("https://listsend.ru/index");
        appManager.loginHelper.logIn(accountData);
    }

    @After
    public void tearDown() throws Exception {
        appManager.logoutHelper.logOut();
        appManager.tearDown();

    }

}
