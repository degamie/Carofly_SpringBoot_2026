//WID(29/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1
package com.carofly.game_server.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService {
    public ChatClient chatClient;
    public void setchatClient(ChatClient chatclient){this.chatClient=chatclient;}//binding chatClient in App
    public OpenAIService(ChatClient.Builder chatclient){
        this.chatClient=chatclient
                .defaultSystem("Carofly Game Server running on SpringAI(Java) framework!")
                .build();
    }
    public String generateresponse(String userId){
        return this.chatClient.prompt()
                .user(userId)
                .call()
                .content();
    }
}
