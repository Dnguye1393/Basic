package com.company;

public class CardRoom {
    private static CardRoom ourInstance = new CardRoom();

    public static CardRoom getInstance() {
        return ourInstance;
    }

    private CardRoom() {
    }
}
