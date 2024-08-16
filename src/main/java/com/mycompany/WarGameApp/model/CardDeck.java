package com.mycompany.WarGameApp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<AbstractCard> deck;

    public CardDeck() {
        deck = new ArrayList<>();
        setupDeck();
        shuffleDeck();
    }

    private void setupDeck() {
        String[] categories = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int value = 2; value <= 14; value++) {
            for (String category : categories) {
                deck.add(new StandardCard(value, category));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public AbstractCard draw() {
        if (deck.isEmpty()) {
            return null;
        } else {
            return deck.remove(0); // Draw and remove the top card from the deck
        }
    }

    public int getDeckSize() {
        return deck.size(); // For debugging deck size
    }
}
