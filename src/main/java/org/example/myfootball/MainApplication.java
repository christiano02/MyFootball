package org.example.myfootball;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import org.example.myfootball.models.DataFactory;
import org.example.myfootball.models.Player;
import javafx.scene.control.TableView;
import javafx.scene.control.ComboBox;
import org.example.myfootball.models.Team;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;


import java.io.IOException;

public class MainApplication extends Application {

    private TableView <Player> tableView;
    private ComboBox<Team> teamComboBox;
    private ObservableList<Team> teams;

    @Override
    public void start(Stage stage) throws IOException {

        //carregar dados dos times
        teams = DataFactory.CreateTeam();
        // ComboBox para seleção do time
        teamComboBox = new ComboBox<>(teams);
        teamComboBox.setPromptText("Selecione um time");
        teamComboBox.setCellFactory(param -> new ListCell<>(){
            @Override
            protected void updateItem(Team item, boolean empty){
                super.updateItem(item,empty);
                setText(empty || item == null ? null : item.getName());
            }
        });
        teamComboBox.setButtonCell(new ListCell<>(){
            @Override
            protected void updateItem(Team item, boolean empty){
                super.updateItem(item, empty);
                setText(empty || item == null ? null : item.getName());
            }
        });
        //Nova tabela
        tableView = new TableView<>();

        TableColumn<Player, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Player, String> positionColumn = new TableColumn<>("Position");
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));

        TableColumn<Player, Integer> powerColumn = new TableColumn<>("Power");
        powerColumn.setCellValueFactory(new PropertyValueFactory<>("power"));

        tableView.getColumns().addAll(nameColumn,positionColumn,powerColumn);

        // Atualizar tabela quando o time for selecionado
        teamComboBox.setOnAction(e -> {
            Team selected = teamComboBox.getSelectionModel().getSelectedItem();
            if (selected != null){
                tableView.setItems(selected.getPlayers());
            }else {
                tableView.setItems(null);
            }
        });
        VBox vbox = new VBox(10, teamComboBox, tableView);
        BorderPane root = new BorderPane();
        root.setCenter(vbox);


        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("My Football");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}