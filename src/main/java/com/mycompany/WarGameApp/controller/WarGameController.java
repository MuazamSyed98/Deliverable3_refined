package com.mycompany.WarGameApp.controller;

import com.mycompany.WarGameApp.model.CardDeck;
import com.mycompany.WarGameApp.model.Competitor;
import com.mycompany.WarGameApp.model.AbstractCard;
import com.mycompany.WarGameApp.view.ConsoleView;

public class WarGameController {
    private CardDeck cardDeck;
    private Competitor player1;
    private Competitor player2;
    private ConsoleView view;

    public WarGameController(ConsoleView view) {
        this.view = view;
        this.cardDeck = new CardDeck();
    }

    public void startGame() {
        initializePlayers();
        distributeCards();
        showHands();
    }

    private void initializePlayers() {
        String name1 = view.getInput("Enter the name of Player 1:");
        String name2 = view.getInput("Enter the name of Player 2:");
        player1 = new Competitor(name1);
        player2 = new Competitor(name2);
    }

    private void distributeCards() {
        int handSize = view.getInputInt("Enter the hand size for each player:");

        for (int i = 0; i < handSize; i++) {
            player1.gainCard(cardDeck.draw());
            player2.gainCard(cardDeck.draw());
        }

        // Debugging to check deck size after distribution
        System.out.println("Remaining deck size: " + cardDeck.getDeckSize());
    }

    private void showHands() {
        player1.showHand();
        player2.showHand();
    }
}
