package com.example.tests;

import com.example.tests.entities.AccountData;
import com.example.tests.entities.TopicData;
import org.junit.*;

import org.openqa.selenium.*;

public class CreateTopic extends TestBase{

    @Test
    public void testListSend() throws Exception {
        appManager.createNoteHelper.createNote(topicData);
    }

}
