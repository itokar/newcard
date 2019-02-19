package com.example.myapplication;

public class Card {

    private int imge_card;
    private String name;
    private String price;

    public Card(int imge_card, String name, String price) {
        this.imge_card = imge_card;
        this.name = name;
        this.price = price;
    }

    public int getImge_card() {
        return imge_card;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
