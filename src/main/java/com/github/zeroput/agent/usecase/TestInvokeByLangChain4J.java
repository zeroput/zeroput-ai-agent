package com.github.zeroput.agent.usecase;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

/**
 * use LangChain4J to invoke the AI
 */
public class TestInvokeByLangChain4J {
    public static void main(String[] args) {
        ChatLanguageModel qwenChatModel = QwenChatModel.builder()
                .apiKey(AIPlatformAPIKey.API_KEY)
                .modelName("qwen-max")
                .build();
        String responseBody = qwenChatModel.chat("你好 你是什么模型？");
        System.out.println(responseBody);
    }


}
