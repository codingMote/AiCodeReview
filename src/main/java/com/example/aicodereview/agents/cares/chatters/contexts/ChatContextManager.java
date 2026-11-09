package com.example.aicodereview.agents.cares.chatters.contexts;

import com.example.aicodereview.agents.cares.chatters.contexts.history.ChatHistoryMgr;
import com.example.aicodereview.agents.cares.chatters.contexts.system.ChatSystemMgr;
import com.example.aicodereview.agents.cares.chatters.contexts.tool.ChatToolMgr;
import com.example.aicodereview.agents.cares.chatters.models.ChatContext;
import org.springframework.stereotype.Component;

/**
 * 会话上下文管理器
 * role：{管理单个会话中的上下文}
 */
@Component
public class ChatContextManager {

    private ChatSystemMgr chatSystemMgr;

    private ChatToolMgr chatToolMgr;

    private ChatHistoryMgr chatHistoryMgr;

    public ChatContextManager(ChatSystemMgr chatSystemMgr, ChatToolMgr chatToolMgr, ChatHistoryMgr chatHistoryMgr){
        this.chatSystemMgr = chatSystemMgr;
        this.chatToolMgr = chatToolMgr;
        this.chatHistoryMgr = chatHistoryMgr;
    }

    /**
     * 初始化聊天上下文
     */
    public ChatContext createChatContext(){
        ChatContext chatContext = new ChatContext();

        //进行系统提示词的初始化
        chatSystemMgr.initSystemContext(chatContext);

        //进行tool提示词初始化
        chatToolMgr.initToolContext(chatContext);

        //初始化结束
        chatContext.stateInitFin();

        return chatContext;
    }

    /**
     * 将
     * @param model
     * @param chatContext
     */
    public void sendContextToLLM(String model, ChatContext chatContext){
        //判断当前上下文的状态，
    }
}





















