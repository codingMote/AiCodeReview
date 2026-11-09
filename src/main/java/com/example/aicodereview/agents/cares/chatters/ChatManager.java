package com.example.aicodereview.agents.cares.chatters;

import com.example.aicodereview.agents.cares.chatters.models.ChatMessage;
import com.example.aicodereview.agents.cares.chatters.models.ChatSession;
import com.example.aicodereview.agents.cares.chatters.session.ChatSessionManager;
import org.springframework.stereotype.Component;

@Component
public class ChatManager {

    private ChatSessionManager chatSessionManager;

    public ChatManager(ChatSessionManager chatSessionManager){
        this.chatSessionManager = chatSessionManager;
    }

    /**
     * 创建聊天窗口
     */
    public void createChat(Long userId){
        //todo userId的正确性应该交给上层建筑进行确认，这里我只负责进行参数校验
        if(userId == null){
            //抛出异常
        }

        //进行会话初始化
        ChatSession chatSession = chatSessionManager.initChatSession(userId);
        System.out.println(chatSession);
    }

    /**
     * 进行聊天
     */
    public void chat(Long sessionId, ChatMessage chatMessage){
        if(sessionId == null){
            //抛出异常
        }

        if(chatMessage == null){
            //抛出异常
        }
        this.chatSessionManager.chatSessionToLLM(sessionId, chatMessage);
    }
}










