package com.mycompany.WarGameApp;

import com.mycompany.WarGameApp.controller.WarGameController;
import com.mycompany.WarGameApp.view.ConsoleView;

public class WarGameApp {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        WarGameController controller = new WarGameController(view);
        controller.startGame();
    }
}
