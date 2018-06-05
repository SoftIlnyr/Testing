package com.example.tests;

import com.example.tests.entities.AccountData;
import com.example.tests.entities.TopicData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ChangeTimezone extends TestBase{
    @Test
    public void testListSend() throws Exception {
        appManager.profileSettingsHelper.openProfileSettings();
        appManager.timezoneHelper.changeTimezone(timezone);

    }



}
