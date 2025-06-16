package org.example.myfootball.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Player {

    private final SimpleStringProperty name;
    private final SimpleStringProperty position;
    private final SimpleIntegerProperty power;

    public Player(String name, String position, int power) {
        this.name = new SimpleStringProperty(name);
        this.position = new SimpleStringProperty(position);
        this.power = new SimpleIntegerProperty(power);
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
