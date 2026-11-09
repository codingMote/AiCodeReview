package com.example.aicodereview.agents.cares.chatters.session;

import com.example.aicodereview.agents.cares.chatters.contexts.ChatContextManager;
import com.example.aicodereview.agents.cares.chatters.models.ChatContext;
import com.example.aicodereview.agents.cares.chatters.models.ChatMessage;
import com.example.aicodereview.agents.cares.chatters.models.ChatSession;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 聊天会话管理器
 * role：{管理多个会话的信息，并与LLM进行交互}
 */
@Component
public class ChatSessionManager {

    //会话容器
    private SessionContainer sessionContainer;

    //会话上下文管理器
    private ChatContextManager chatContextManager;

    public ChatSessionManager(ChatContextManager chatContextManager){
        this.sessionContainer = new SessionContainer();
        this.chatContextManager = chatContextManager;
    }

    /**
     * 会话初始化
     */
    public ChatSession initChatSession(Long userId){
        //创建一个会话对象
        ChatSession chatSession = new ChatSession(userId);

        //调用上下文管理器，初始化当前会话的基础内容
        ChatContext chatContext = this.chatContextManager.createChatContext();

        //初始化会话上下文
        chatSession.initChatContext(chatContext);

        //将当前会话添加到管理器中
        this.sessionContainer.put(chatSession.getSessionId(), chatSession);

        return chatSession;
    }

    /**
     * 通过会话与LLM进行chat
     * @param charSessionId
     * @param chatMessage
     */
    public void chatSessionToLLM(Long charSessionId, ChatMessage chatMessage){
        //获取对应的会话对象
        ChatSession chatSession = this.sessionContainer.get(charSessionId);

        //将当前消息添加到会话对象中
        chatSession.addChatMessage(chatMessage.getMessage());

        //将会话对象的上下文传给上下文管理器
        this.chatContextManager.sendContextToLLM(chatMessage.getModel(),chatSession.getChatContext());

        //将上下文管理器返回的数据进行包装

        //结果返回上层
    }
}



















