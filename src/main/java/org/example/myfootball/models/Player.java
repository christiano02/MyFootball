package org.example.myfootball.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Player {

    private final SimpleStringProperty name;
    private final SimpleStringProperty position;
    private final SimpleIntegerProperty power;

    public Player(SimpleStringProperty name, SimpleStringProperty position, SimpleIntegerProperty power) {
        this.name = name;
        this.position = position;
        this.power = power;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public int getPower() {
        return power.get();
    }

    public SimpleIntegerProperty powerProperty() {
        return power;
    }
}
