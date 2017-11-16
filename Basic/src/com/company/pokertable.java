package com.company;

import java.util.HashMap;

public class pokertable {
    private int numberOfSeats;
    private String [] gamesChosen;
    private int numOfPlayers =0;
    private HashMap <String,Integer> name_id = new HashMap();
    private HashMap <Integer, Integer> id_seatNumber = new HashMap();

    public pokertable(int seats, String []games){
        numberOfSeats = seats;
        gamesChosen = games;
    }

}
