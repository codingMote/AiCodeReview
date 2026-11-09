package com.example.aicodereview.agents.cares.chatters.models.message;

/**
 * 信息基类
 * role：{当前发送的所有消息内容，都是Message}
 */
public class Message {
    //问答角色
    private String role;

    //聊天内容
    private Content content;

    //聊天创建时间
    private long createTime;

    public Message(String role, Content content){
        this.role = role;
        this.content = content;
        this.createTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Message{" +
                "role='" + role + '\'' +
                ", content=" + content +
                ", createTime=" + createTime +
                '}';
    }
}
