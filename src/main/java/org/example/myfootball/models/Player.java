package org.example.myfootball.models;

import javafx.beans.property.*;

public class Player {


    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty position;
    private final SimpleIntegerProperty overall;
    private final SimpleDoubleProperty amout;

    public Player(Integer id, String name, String position, Integer overall, Double amout) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.position = new SimpleStringProperty(position);
        this.overall = new SimpleIntegerProperty(overall);
        this.amout = new SimpleDoubleProperty(amout);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getPosition() {
        return position.get();
    }

    public StringProperty positionProperty() {
        return position;
    }

    public int getOverall() {
        return overall.get();
    }

    public IntegerProperty overallProperty() {
        return overall;
    }

    public double getAmout() {
        return amout.get();
    }

    public DoubleProperty amoutProperty() {
        return amout;
    }
}
