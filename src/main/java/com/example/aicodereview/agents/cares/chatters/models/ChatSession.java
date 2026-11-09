package com.example.aicodereview.agents.cares.chatters.models;

import com.example.aicodereview.agents.cares.chatters.models.message.Message;

import java.util.List;

/**
 * 聊天会话
 * 由会话管理器进行操作
 */
public class ChatSession {

    //会话id
    private Long sessionId;

    //会话持有人
    private Long userId;

    //会话状态
    private SessionState sessionState;

    //会话上下文
    private ChatContext chatContext;

    public ChatSession(Long userId){
        //todo
        this.sessionId = 0l;
        this.userId = userId;
        this.sessionState = SessionState.INIT;
    }

    /**
     * 初始化会话上下文
     * @param chatContext
     */
    public void initChatContext(ChatContext chatContext){
        //判断当前会话状态是否为init
        if(this.sessionState == SessionState.INIT){
            if(chatContext != null){
                //设置会话上下文
                this.chatContext = chatContext;
                this.chatContext.stateRun();
                //修改状态
                this.sessionState = SessionState.RUN;
            }

            //todo 抛出异常
        }

        //todo 抛出异常
    }

    /**
     * 添加消息到当前上下文中
     * @param message
     */
    public void addChatMessage(Message message){
        //todo 健壮性不足
        this.chatContext.appendMessage(message);
    }


    public ChatContext getChatContext(){
        return this.chatContext;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public SessionState getSessionState() {
        return sessionState;
    }

    @Override
    public String toString() {
        return "ChatSession{" +
                "sessionId=" + sessionId +
                ", userId=" + userId +
                ", sessionState=" + sessionState +
                ", chatContext=" + chatContext +
                '}';
    }
}












