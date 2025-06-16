package org.example.myfootball.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class Team {

    private String name;
    private final ObservableList <Player> players = FXCollections.observableArrayList();

    public Team(String name) {
        this.name = name;
    }
    //GETTERS


    public String getName() {
        return name;
    }

    public ObservableList<Player> getPlayers() {
        return players;
    }

    //METHOD ADD PLAYER
    public void addPlayer(Player player){
        players.add(player);
    }

}
