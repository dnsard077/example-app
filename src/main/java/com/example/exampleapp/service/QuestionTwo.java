package com.example.exampleapp.service;

import com.example.exampleapp.model.QuestionTwoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QuestionTwo {
    @Autowired
    WebClient webClient;
    public void questionTwoPost(QuestionTwoRequest questionTwoRequest){
        String res = webClient.post()
                .uri("/yDEEW3KjymTG9yjj9830")
                .bodyValue(questionTwoRequest)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Result : " + res);
    }
}
