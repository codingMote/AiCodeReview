package com.example.aicodereview;

import com.example.aicodereview.agents.cares.chatters.ChatManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.http.HttpClient;

@SpringBootTest
class AiCodeReviewApplicationTests {

    @Autowired
    ChatManager chatManager;

    @Test
    void contextLoads() {
        chatManager.createChat(1l);
    }

}
