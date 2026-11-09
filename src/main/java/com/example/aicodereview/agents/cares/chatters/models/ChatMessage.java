package com.example.aicodereview.agents.cares.chatters.models;

import com.example.aicodereview.agents.cares.chatters.models.message.Message;

import java.util.List;

/**
 * 聊天传入参数
 * 唯一对外的传入数据
 */
public class ChatMessage {

    //模型
    private String model;

    //一次只能传单条消息
    private Message message;

    public String getModel() {
        return model;
    }

    public Message getMessage() {
        return message;
    }
}
