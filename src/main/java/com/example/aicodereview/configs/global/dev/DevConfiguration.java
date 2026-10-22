package com.example.aicodereview.configs.global.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.net.http.HttpClient;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * dev配置项
 * 只有开发环境生效
 */
@Configuration
@Profile("dev")
public class DevConfiguration {
    @Value("${ollama.host}")
    private String host;

    @Value("${ollama.port}")
    private String port;

    @Value("${ollama.api.chat}")
    private String chatApi;

    @Value("${ollama.api.system-one}")
    private String systemOneApi;

    @Qualifier("chatPoolExecutor")
    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    //构建一个与ollama连接的HttpClient
    @Bean
    public HttpClient buildHttpClient(){
        return HttpClient.newBuilder().build();
    }

    //获取chat api key
    public String getChatApiKey(){
        return this.getBaseUrl() + "/" + this.chatApi;
    }

    //获取systemOne api key
    public String getSystemOneApiKey(){
        return this.getBaseUrl() + "/" + this.systemOneApi;
    }


    //获取ollama基地址
    private String getBaseUrl(){
        return "http://" + this.host + ":" + this.port;
    }
}













