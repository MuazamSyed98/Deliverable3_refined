package com.mycompany.WarGameApp.model;

import java.util.ArrayList;
import java.util.List;

public class Competitor {
    private String identifier;
    private List<AbstractCard> hand;

    public Competitor(String identifier) {
        this.identifier = identifier;
        this.hand = new ArrayList<>();
    }

    public void gainCard(AbstractCard card) {
        if (card != null) {
            hand.add(card);
        }
    }

    public void showHand() {
        System.out.println(identifier + " has the following cards:");
        for (AbstractCard card : hand) {
            System.out.println("  - " + card.describe());
        }
    }
}
