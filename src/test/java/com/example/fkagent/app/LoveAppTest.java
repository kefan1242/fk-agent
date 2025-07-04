package com.example.fkagent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LoveAppTest {

    @Resource
    private LoveApp loveApp;
    @Test
    void TestChat() {
        String chatId= UUID.randomUUID().toString();

        //1
        String message="Hello World!我是彦祖";
        String answer= loveApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);
        //2
        message="我是彦祖，我的情感出现了问题，因为我和我的对象异地恋";
        answer= loveApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);
        //3
        message="我的对象着急结婚，但是我家里不同意，因为她学历太低";
        answer= loveApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);
    }


    @Test
    void doChatWithReport() {
        String chatId = UUID.randomUUID().toString();
        // 第一轮
        String message = "你好，我是程序员鱼皮，我想让另一半（编程导航）更爱我，但我不知道该怎么做";
        LoveApp.LoveReport loveReport = loveApp.doChatWithReport(message, chatId);
        Assertions.assertNotNull(loveReport);
    }

    @Test
    void doChatWithRag() {
        String chatId = UUID.randomUUID().toString();
        String message = "我已经结婚了，但是婚后关系不太亲密，怎么办？";
        String answer =  loveApp.doChatWithRag(message, chatId);
        Assertions.assertNotNull(answer);
    }

}