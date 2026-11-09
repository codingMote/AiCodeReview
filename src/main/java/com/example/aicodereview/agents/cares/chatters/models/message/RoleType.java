package com.example.aicodereview.agents.cares.chatters.models.message;

/**
 * 角色类型
 */
public enum RoleType {
    USER("user"),
    SYSTEM("system"),
    ASSISTANT("assistant"),
    TOOL("tool");

    private String roleName;

    RoleType(String roleName){
        this.roleName = roleName;
    }

    public String getRole(){
        return this.roleName;
    }
}
