package com.example.aicodereview.agents.models.ollama;

import java.util.*;

public class ChatPromptStruct {

    private String model;
    private List<Message> messages;

    private class Message {
        String role;
        String content;
    }

    /**
     * 构建chat提示词
     * @param model
     * @return
     */
    public ChatPromptStruct buildChatPromptContent(String model){
        ChatPromptStruct chatPromptStruct = new ChatPromptStruct();
        chatPromptStruct.setModel(model);
        chatPromptStruct.initMessage();
        return chatPromptStruct;
    }

    /**
     * 添加对话信息
     * @param role
     * @param content
     */
    public void addMessage(String role, String content){
        //必须保证role为system, user, assistant, tool中的一个
        //todo 检测role结构

        //创建Message对象
        Message message = new Message();
        message.role = role;
        message.content = content;

        //添加到当前提示词结构
        this.messages.add(message);

        //todo 上下文管理，如果超限需要进行处理
    }

    private void setModel(String model){
        //检测model是否存在
        this.model = model;
    }

    private void initMessage(){
        this.messages = new ArrayList<>();
    }
}
