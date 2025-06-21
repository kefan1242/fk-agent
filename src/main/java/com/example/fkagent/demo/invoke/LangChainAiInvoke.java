package com.example.fkagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.Api_key)
                .modelName("qwen-max")
                .build();
        String answer = qwenModel.chat("我是程fk，这里是雾都");
        System.out.println(answer);
    }
}

