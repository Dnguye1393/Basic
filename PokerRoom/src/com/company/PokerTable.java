package src.com.company;

import java.util.HashMap;

public class PokerTable {
    private int numberOfSeats;
    private String [] gamesChosen;
    private int numOfPlayers =0;
    private HashMap <String,Integer> name_id = new HashMap();
    private HashMap <Integer, Integer> id_seatNumber = new HashMap();

    public PokerTable(int seats, String []games){
        numberOfSeats = seats;
        gamesChosen = games;
    }

}
