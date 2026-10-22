package com.example.aicodereview.agents.llm;

/**
 * 大模型聊天者
 * 所有与大模型交互的对象，都需要实现当前接口
 */
public interface LLMChatter {
    String chat(String prompt);
}
