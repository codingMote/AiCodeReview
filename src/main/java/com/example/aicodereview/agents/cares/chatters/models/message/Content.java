package com.example.aicodereview.agents.cares.chatters.models.message;

/**
 * 内容父类
 */
public abstract class Content<T> {

    //当前内容的类型
    private ContentType contentType;

    //获取当前内容的类型:图片、普通对话、function
    public ContentType getContentType(){
        return this.contentType;
    }

    //获取当前内容的值
    public T getContent(){


        return null;
    }

    //真正返回内容，只允许子类实现，不允许调用
    protected abstract Object getContentValue();
}
