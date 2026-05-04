package com.example.opp_project.pages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class HomePage {

    private final VBox view;

    private TextField studentIdField;
    private Label studentInfoLabel;

    public HomePage() {
        view = new VBox();
        view.setPadding(new Insets(20));
        view.setSpacing(20);
        view.setStyle("-fx-background-color: #d9d9d9; -fx-border-color: black; -fx-border-width: 2;");

        HBox topSection = new HBox();
        topSection.setSpacing(25);
        topSection.setAlignment(Pos.TOP_LEFT);

        topSection.getChildren().addAll(
                createSearchBox(),
                createStudentInfoBox()
        );

        view.getChildren().addAll(
                topSection,
                createGraduationStatusBox()
        );
    }

    public VBox getView() {
        return view;
    }

    private HBox createSearchBox() {
        HBox searchBox = new HBox();
        searchBox.setPadding(new Insets(20));
        searchBox.setSpacing(12);
        searchBox.setAlignment(Pos.CENTER_LEFT);
        searchBox.setPrefWidth(420);
        searchBox.setMinWidth(420);
        searchBox.setPrefHeight(105);

        searchBox.setStyle(
                "-fx-background-color: #d9d9d9;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 14;" +
                        "-fx-background-radius: 14;"
        );

        Label label = new Label("학번 입력:");
        label.setFont(Font.font(20));
        label.setMinWidth(95);

        studentIdField = new TextField();
        studentIdField.setPrefWidth(170);
        studentIdField.setMinWidth(170);
        studentIdField.setPromptText("10자리 학번");
        studentIdField.setFont(Font.font(16));

        Button searchButton = new Button("검색");
        searchButton.setFont(Font.font(16));
        searchButton.setPrefWidth(70);
        searchButton.setMinWidth(70);

        searchButton.setStyle(
                "-fx-background-color: #eeeeee;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 1;" +
                        "-fx-border-radius: 6;" +
                        "-fx-background-radius: 6;"
        );

        searchButton.setOnAction(e -> searchStudent());
        studentIdField.setOnAction(e -> searchStudent());

        searchBox.getChildren().addAll(label, studentIdField, searchButton);

        return searchBox;
    }

    private VBox createStudentInfoBox() {
        VBox wrapper = new VBox();
        wrapper.setSpacing(5);

        Label title = new Label("학생 정보");
        title.setFont(Font.font(24));

        studentInfoLabel = new Label("학번을 입력하면 자동으로 학과와 학번이 표시됩니다.");
        studentInfoLabel.setFont(Font.font(18));
        studentInfoLabel.setWrapText(true);

        VBox infoBox = new VBox(studentInfoLabel);
        infoBox.setPadding(new Insets(12));
        infoBox.setPrefWidth(650);
        infoBox.setMinWidth(650);
        infoBox.setPrefHeight(105);
        infoBox.setMinHeight(105);

        infoBox.setStyle(
                "-fx-background-color: #d9d9d9;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 14;" +
                        "-fx-background-radius: 14;"
        );

        wrapper.getChildren().addAll(title, infoBox);

        return wrapper;
    }

    private void searchStudent() {
        String studentId = studentIdField.getText().trim();

        if (!isValidStudentId(studentId)) {
            showAlert("학번은 숫자 10자리로 입력해야 합니다.");
            return;
        }

        String admissionYear = studentId.substring(0, 4);
        String studentNumber = admissionYear.substring(2, 4);
        String departmentCode = studentId.substring(4, 7);
        String birthCode = studentId.substring(7, 10);

        String departmentName = getDepartmentName(admissionYear, departmentCode);

        if (departmentName == null) {
            showAlert("해당 입학년도와 학과 코드에 맞는 학과를 찾을 수 없습니다.");
            return;
        }

        studentInfoLabel.setText(
                "학과: " + departmentName + "\t" +
                        "학번: " + studentNumber + "학번"
        );
    }

    private boolean isValidStudentId(String studentId) {
        return studentId.matches("\\d{10}");
    }

    private String getDepartmentName(String admissionYear, String departmentCode) {
        int year = Integer.parseInt(admissionYear);

        if (year >= 2020 && year <= 2023) {
            return switch (departmentCode) {
                case "202" -> "컴퓨터정보공학부";
                case "203" -> "소프트웨어학부";
                case "204" -> "정보융합학부";
                case "206" -> "로봇학부";
                default -> null;
            };
        }

        if (year >= 2024 && year <= 2026) {
            return switch (departmentCode) {
                case "402" -> "컴퓨터정보공학부";
                case "403" -> "소프트웨어학부";
                case "404" -> "정보융합학부";
                case "406" -> "로봇학부";
                default -> null;
            };
        }

        return null;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("입력 오류");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private VBox createGraduationStatusBox() {
        VBox wrapper = new VBox();
        wrapper.setSpacing(5);

        Label title = new Label("졸업요건 현황");
        title.setFont(Font.font(24));

        HBox statusBox = new HBox();
        statusBox.setPadding(new Insets(15, 20, 15, 20));
        statusBox.setSpacing(30);
        statusBox.setAlignment(Pos.CENTER_LEFT);

        statusBox.setStyle(
                "-fx-background-color: #d9d9d9;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 14;" +
                        "-fx-background-radius: 14;"
        );

        VBox progressArea = new VBox();
        progressArea.setSpacing(10);

        ProgressBar progressBar = new ProgressBar(0.78);
        progressBar.setPrefWidth(350);
        progressBar.setPrefHeight(25);

        HBox progressText = new HBox();
        progressText.setSpacing(150);

        Label percent = new Label("78% 완료");
        percent.setFont(Font.font(20));

        Label credit = new Label("112/133 학점");
        credit.setFont(Font.font(20));

        progressText.getChildren().addAll(percent, credit);
        progressArea.getChildren().addAll(progressBar, progressText);

        statusBox.getChildren().addAll(
                progressArea,
                createCreditBox("총 학점", "112/133"),
                createCreditBox("전공", "48/60"),
                createCreditBox("교양", "52/60"),
                createCreditBox("기타", "10/12")
        );

        wrapper.getChildren().addAll(title, statusBox);

        return wrapper;
    }

    private VBox createCreditBox(String title, String value) {
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setPrefWidth(110);
        box.setPrefHeight(70);

        Label titleLabel = new Label(title);
        titleLabel.setFont(Font.font(18));

        Label valueLabel = new Label(value);
        valueLabel.setFont(Font.font(20));

        box.getChildren().addAll(titleLabel, valueLabel);

        box.setStyle(
                "-fx-background-color: #d9d9d9;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 8;" +
                        "-fx-background-radius: 8;"
        );

        return box;
    }
}