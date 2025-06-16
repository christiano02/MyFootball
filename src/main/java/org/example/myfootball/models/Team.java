package org.example.myfootball.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Team {

    private final SimpleStringProperty name;
    private final ObservableList <Player> players;

    public Team(SimpleStringProperty name, ObservableList<Player> players) {
        this.name = name;
        this.players = players;
    }
    //GETTERS
    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
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
