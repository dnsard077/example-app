package com.example.exampleapp.service;

import com.example.exampleapp.model.QuestionThreeRequest;
import com.example.exampleapp.model.QuestionTwoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class AppMenu {
    @Autowired
    QuestionOne questionOne;

    @Autowired
    QuestionTwo questionTwo;

    @Autowired
    QuestionThree questionThree;
    public void initMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            // Display menu options
            System.out.println("App Menu:");
            System.out.println("1. Print Loop algorithm");
            System.out.println("2. Make HTTP POST request question two");
            System.out.println("3. Make HTTP POST request question three");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    questionOne.printLoopAlgo(5);
                    break;
                case 2:
                    questionTwo.questionTwoPost(QuestionTwoRequest
                            .builder()
                            .name("Danis")
                            .address("Jakarta")
                            .build());
                    break;
                case 3:
                    questionThree.questionThreePost(QuestionThreeRequest
                            .builder()
                            .nid(10)
                            .officeId(3)
                            .build());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
