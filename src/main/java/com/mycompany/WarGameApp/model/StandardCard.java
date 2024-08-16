package com.mycompany.WarGameApp.model;

public class StandardCard extends AbstractCard {
    private String category;

    public StandardCard(int value, String category) {
        super(value);
        this.category = category;
    }

    @Override
    public String describe() {
        String rankName;
        switch (value) {
            case 11: rankName = "Jack"; break;
            case 12: rankName = "Queen"; break;
            case 13: rankName = "King"; break;
            case 14: rankName = "Ace"; break;
            default: rankName = String.valueOf(value);
        }
        return rankName + " of " + category;
    }
}
