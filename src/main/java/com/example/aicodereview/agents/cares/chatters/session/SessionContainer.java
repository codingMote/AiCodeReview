package com.example.aicodereview.agents.cares.chatters.session;

import com.example.aicodereview.agents.cares.chatters.models.ChatSession;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * session容器，管理所有的会话
 */
@Component
public class SessionContainer {

    //聊天会话map；key：sessionId，value：聊天对话对象
    Map<Long, ChatSession> chatSessionMap;

    public SessionContainer(){
        this.chatSessionMap = new HashMap<>();
    }

    /**
     * 将会话添加到容器中
     * @param key
     * @param value
     */
    public void put(Long key, ChatSession value){
        if(key == null){
            //报错，
        }

        if(value == null){

        }

        if(chatSessionMap.containsKey(key)){
            //当前会话已经存在，进行报错
        }

        //添加到map中
        chatSessionMap.put(key,value);
    }

    /**
     * 获取会话
     * @param key
     * @return
     */
    public ChatSession get(Long key){
        if(key == null){
            //报错
        }

        ChatSession chatSession = chatSessionMap.get(key);

        if(chatSession == null){
            //当前会话不存在，报错
        }

        return chatSession;
    }
}














