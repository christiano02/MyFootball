package org.example.myfootball.models;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class DataFactory {

    public static ObservableList CreateTeam(){
        Team team1 = new Team("TIME A");

        team1.addPlayer(new Player("JOÃO", "ATA",50));
        team1.addPlayer(new Player("CHRISTIANO","GOL", 55));

        Team team2 = new Team("TIME B");

        team2.addPlayer(new Player("LUCAS","ZAG",50));
        team2.addPlayer(new Player("WILGNER", "LAT",55));

        ObservableList<Team> teams = FXCollections.observableArrayList();
        teams.addAll(team1,team2);

        return teams;
    }

}
