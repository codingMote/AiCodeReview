package com.example.aicodereview.agents.cares.chatters.contexts.tool;

import com.example.aicodereview.agents.cares.chatters.models.ChatContext;
import com.example.aicodereview.agents.cares.chatters.models.message.Message;
import com.example.aicodereview.agents.cares.chatters.models.message.RoleType;
import org.springframework.stereotype.Component;

/**
 * 函数提示词管理器
 */
@Component
public class ChatToolMgr {

    private RoleType roleType;

    public ChatToolMgr(){
        this.roleType = RoleType.TOOL;
    }

    /**
     * 函数提示词初始化
     * @param chatContext
     */
    public void initToolContext(ChatContext chatContext) {
        System.out.println("函数提示词初始化");
        chatContext.appendMessage(new Message(this.roleType.getRole(),null));
    }
}
