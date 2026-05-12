package com.example.opp_project.layout;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SideMenu {

    private final VBox view;

    public SideMenu(MainLayout mainLayout) {
        view = new VBox();
        view.setPadding(new Insets(35, 20, 20, 25));
        view.setSpacing(30);
        view.setPrefWidth(230);
        view.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 0 2 0 0;");

        Button homeButton = createMenuButton("홈");
        Button majorButton = createMenuButton("전공 과목 조회");
        Button calculatorButton = createMenuButton("학점 계산기");

        homeButton.setOnAction(e -> mainLayout.showHomePage());
        majorButton.setOnAction(e -> mainLayout.MajorCourseSearchPage());
        calculatorButton.setOnAction(e -> mainLayout.showCreditCalculatorPage());

        view.getChildren().addAll(
                homeButton,
                majorButton,
                calculatorButton
        );
    }

    public VBox getView() {
        return view;
    }

    private Button createMenuButton(String text) {
        Button button = new Button(text);

        button.setPrefWidth(190);
        button.setPrefHeight(65);
        button.setFont(Font.font(22));

        button.setStyle(
                "-fx-background-color: #d0d0d0;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 12;" +
                        "-fx-background-radius: 12;" +
                        "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.35), 8, 0.3, 3, 5);"
        );

        return button;
    }
}