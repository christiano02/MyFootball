module org.example.myfootball {
    opens org.example.myfootball.models to javafx.base;


    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.myfootball to javafx.fxml;
    exports org.example.myfootball;
    exports org.example.myfootball.controller;
    opens org.example.myfootball.controller to javafx.fxml;

}
