package com.example.myapplication;

public class Card {

    private int imge_card;
    private String name;
    private int  price;
    private String carrnse;

    public Card(int imge_card, String name, int  price, String carrnse) {
        this.imge_card = imge_card;
        this.name = name;
        this.price = price;
        this.carrnse = carrnse;
    }

    public int getImge_card() {
        return imge_card;
    }

    public String getName() {
        return name;
    }

    public int  getPrice() {
        return price;
    }

    public String getcarrnse(){
        return carrnse;
    }
}
