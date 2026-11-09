package com.example.aicodereview.agents.cares.chatters.contexts.system;

import com.example.aicodereview.agents.cares.chatters.models.ChatContext;
import com.example.aicodereview.agents.cares.chatters.models.message.Message;
import com.example.aicodereview.agents.cares.chatters.models.message.RoleType;
import org.springframework.stereotype.Component;

/**
 * 聊天系统提示词管理器
 */
@Component
public class ChatSystemMgr {

    private RoleType roleType;

    public ChatSystemMgr(){
        this.roleType = RoleType.SYSTEM;
    }

    /**
     * 进行系统提示词初始化
     * @param chatContext
     */
    public void initSystemContext(ChatContext chatContext){
        System.out.println("系统提示词初始化");
        chatContext.appendMessage(new Message(this.roleType.getRole(),null));
    }
}
