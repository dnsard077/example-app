package com.example.exampleapp.service;

import org.springframework.stereotype.Service;

@Service
public class QuestionOne {
    public void printLoopAlgo(Integer rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
