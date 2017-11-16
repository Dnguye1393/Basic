package com.company;

public enum PokerTableRules {
    minNumPlayer("Start",6);


    private final String status;
    private final int numOfPlayers;

    PokerTableRules(String stat, int number) {
        this.status = stat;
        numOfPlayers = number;
    }

    public int getNumber(){
        return numOfPlayers;
    }
    public String getStatus(){
        return status;
    }
}
