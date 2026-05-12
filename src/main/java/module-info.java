module com.example.opp_project {
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

    opens com.example.opp_project to javafx.fxml;
    opens com.example.opp_project.pages to javafx.base;
    exports com.example.opp_project;
    exports com.example.opp_project.pages;
}