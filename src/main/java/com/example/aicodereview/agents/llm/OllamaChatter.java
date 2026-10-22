package com.example.aicodereview.agents.llm;

import org.springframework.stereotype.Component;

import java.net.http.HttpClient;

/**
 * ollama
 */
@Component("OllamaChatter")
public class OllamaChatter implements LLMChatter{

    //内部维护httpClient
    private HttpClient httpClient;

    public OllamaChatter(HttpClient httpClient){
        this.httpClient = httpClient;
    }

    @Override
    public String chat(String prompt) {
        return "";
    }

}
