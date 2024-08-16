package com.mycompany.WarGameApp.view;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int getInputInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
