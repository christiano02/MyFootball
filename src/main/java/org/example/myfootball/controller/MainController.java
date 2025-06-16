package org.example.myfootball.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.myfootball.models.Player;
import org.example.myfootball.models.Team;
import org.example.myfootball.models.DataFactory;
import javafx.scene.control.Label;

public class MainController {
    //tabela do time A
    @FXML
    private TableView<Player> tableTimeA;

    @FXML
    private TableColumn<Player, Integer> columnIdA;

    @FXML
    private TableColumn<Player, String> columnNameA;

    @FXML
    private TableColumn<Player, String> columnPositionA;

    @FXML
    private TableColumn<Player, Integer> columnOverallA;

    private TableColumn<Player, Double> columnAmountA;

    //tabela do time b
    @FXML
    private TableView<Player> tableTimeB;

    @FXML
    private TableColumn<Player, Integer> columnIdB;

    @FXML
    private TableColumn<Player, String> columnNameB;

    @FXML
    private TableColumn<Player, String> columnPositionB;

    @FXML
    private TableColumn<Player, Integer> columnOverallB;

    private TableColumn<Player, Double> columnAmountB;

    //criar time
    private Team teamA = new Team("TeamA");
    private Team teamB = new Team("teamB");

    @FXML
    public void initialize(){
        //Configurar Colunas
        columnIdA.setCellValueFactory(cell -> cell.getValue().idProperty().asObject());
        columnNameA.setCellValueFactory(cell -> cell.getValue().nameProperty());
        columnPositionA.setCellValueFactory(cell -> cell.getValue().positionProperty());
        columnOverallA.setCellValueFactory(cell -> cell.getValue().overallProperty().asObject());
        columnAmountA.setCellValueFactory(cell -> cell.getValue().amoutProperty().asObject());

        columnIdB.setCellValueFactory(cell -> cell.getValue().idProperty().asObject());
        columnNameB.setCellValueFactory(cell -> cell.getValue().nameProperty());
        columnPositionB.setCellValueFactory(cell -> cell.getValue().positionProperty());
        columnOverallB.setCellValueFactory(cell -> cell.getValue().overallProperty().asObject());
        columnAmountB.setCellValueFactory(cell -> cell.getValue().amoutProperty().asObject());

        tableTimeA.setItems(teamA.getPlayers());
        tableTimeB.setItems(teamB.getPlayers());

        teamA.addPlayer(new Player(1, "Joao", "MeioA",10,100000.00));
        teamB.addPlayer(new Player(1, "Joao", "MeioA",10,100000.00));


    }

}