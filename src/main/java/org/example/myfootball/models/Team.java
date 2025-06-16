package org.example.myfootball.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class Team {

    private final SimpleStringProperty name;
    private final ObservableList <Player> players;

    public Team(String name) {
        this.name = new SimpleStringProperty(name);
        this.players = FXCollections.observableArrayList();
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
