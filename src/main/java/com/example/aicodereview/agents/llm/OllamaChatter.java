package com.example.aicodereview.agents.llm;

/**
 * ollama
 */
public class OllamaChatter implements LLMChatter{

    private static OllamaChatter ollamaChatter = new OllamaChatter();

    public LLMChatter getInstance(){
        return ollamaChatter;
    }

    @Override
    public String chat(String prompt) {
        return "";
    }

    //内部维护httpClient

}
