package com.example.opp_project;

import com.example.opp_project.layout.MainLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        MainLayout mainLayout = new MainLayout();

        Scene scene = new Scene(mainLayout.getRoot(), 1200, 700);

        stage.setTitle("Kwangwoon Graduation Assistance System");
        stage.setScene(scene);
        stage.show();

        mainLayout.showHomePage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}