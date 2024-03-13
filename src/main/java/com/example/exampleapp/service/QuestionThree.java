package com.example.exampleapp.service;

import com.example.exampleapp.model.QuestionThreeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QuestionThree {
    @Autowired
    WebClient webClient;

    public void questionThreePost(QuestionThreeRequest questionThreeRequest){
        String res = webClient.post()
                .uri("/yDEEW3KjymTG9yjj9830")
                .bodyValue(questionThreeRequest)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Result : " + res);
    }
}
