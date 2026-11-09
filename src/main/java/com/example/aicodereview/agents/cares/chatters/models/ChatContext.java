package com.example.aicodereview.agents.cares.chatters.models;

import com.example.aicodereview.agents.cares.chatters.models.message.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * 聊天上下文
 * 由上下文管理器负责操作
 */
public class ChatContext {

    //上下文状态
    private ContextState contextState;

    //聊天上下文应该不去关心是什么模型，只负责管理prompt
    private List<Message> messageList;

    public ChatContext(){
        this.init();
    }

    /**
     * 添加消息到上下文中
     * @param message
     */
    public void appendMessage(Message message){
        if(this.messageList != null){
            messageList.add(message);
        }
    }

    //进行初始化
    private void init(){
        this.contextState = ContextState.INIT;
        this.messageList = new ArrayList<>();
    }

    /**
     * 初始化结束
     */
    public void stateInitFin(){
        if(this.contextState == ContextState.INIT) {
            this.contextState = ContextState.INIT_FIN;
        }
        //抛出异常
    }

    /**
     * 运行
     */
    public void stateRun(){
        if(this.contextState == ContextState.INIT_FIN){
            this.contextState = ContextState.RUN;
        }

        //抛出异常
    }

    public ContextState getContextState() {
        return contextState;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    @Override
    public String toString() {
        return "ChatContext{" +
                "contextState=" + contextState +
                ", messageList=" + messageList +
                '}';
    }
}
