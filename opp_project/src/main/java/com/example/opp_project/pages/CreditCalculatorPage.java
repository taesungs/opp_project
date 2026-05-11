package com.example.opp_project.pages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class CreditCalculatorPage {

    private final VBox view;

    private final List<CourseGrade> courseGrades = new ArrayList<>();

    private TextField subjectField;
    private TextField creditField;
    private ComboBox<String> gradeBox;
    private ListView<String> courseListView;
    private Label resultLabel;

    public CreditCalculatorPage() {
        view = createBasePage();

        Label title = createPageTitle("학점 계산기");

        VBox contentBox = createContentBox();

        Label guide = new Label("과목명, 학점, 성적을 입력하면 예상 평점을 계산합니다.");
        guide.setFont(Font.font(18));

        HBox inputRow = createInputRow();

        courseListView = new ListView<>();
        courseListView.setPrefHeight(220);

        resultLabel = new Label("예상 평점: -");
        resultLabel.setFont(Font.font(20));

        contentBox.getChildren().addAll(
                guide,
                inputRow,
                courseListView,
                resultLabel
        );

        view.getChildren().addAll(title, contentBox);
    }

    public VBox getView() {
        return view;
    }

    private HBox createInputRow() {
        HBox inputRow = new HBox();
        inputRow.setSpacing(10);
        inputRow.setAlignment(Pos.CENTER_LEFT);

        subjectField = new TextField();
        subjectField.setPromptText("과목명");
        subjectField.setPrefWidth(160);

        creditField = new TextField();
        creditField.setPromptText("학점");
        creditField.setPrefWidth(80);

        creditField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                creditField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        gradeBox = new ComboBox<>();
        gradeBox.getItems().addAll("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F");
        gradeBox.setPromptText("성적");
        gradeBox.setPrefWidth(100);

        Button addButton = new Button("추가");
        Button calculateButton = new Button("계산");
        Button deleteButton = new Button("삭제");

        addButton.setOnAction(e -> addCourse());
        calculateButton.setOnAction(e -> calculateGpa());
        deleteButton.setOnAction(e -> deleteSelectedCourse());

        inputRow.getChildren().addAll(
                subjectField,
                creditField,
                gradeBox,
                addButton,
                calculateButton,
                deleteButton
        );

        return inputRow;
    }

    private void addCourse() {
        String subject = subjectField.getText().trim();
        String creditText = creditField.getText().trim();
        String grade = gradeBox.getValue();

        if (subject.isEmpty()) {
            showAlert("과목명을 입력하세요.");
            return;
        }

        if (creditText.isEmpty()) {
            showAlert("학점을 입력하세요.");
            return;
        }

        int credit;

        try {
            credit = Integer.parseInt(creditText);
        } catch (NumberFormatException e) {
            showAlert("학점은 숫자로 입력해야 합니다.");
            return;
        }

        if (credit <= 0) {
            showAlert("학점은 1 이상이어야 합니다.");
            return;
        }

        if (grade == null) {
            showAlert("성적을 선택하세요.");
            return;
        }

        CourseGrade courseGrade = new CourseGrade(subject, credit, grade);
        courseGrades.add(courseGrade);

        courseListView.getItems().add(
                subject + " / " + credit + "학점 / " + grade
        );

        subjectField.clear();
        creditField.clear();
        gradeBox.setValue(null);

        resultLabel.setText("예상 평점: -");
    }

    private void calculateGpa() {
        if (courseGrades.isEmpty()) {
            showAlert("먼저 과목을 추가하세요.");
            return;
        }

        int totalCredits = 0;
        double totalScore = 0.0;

        for (CourseGrade courseGrade : courseGrades) {
            double gradePoint = convertGradeToPoint(courseGrade.getGrade());

            totalCredits += courseGrade.getCredit();
            totalScore += gradePoint * courseGrade.getCredit();
        }

        double gpa = totalScore / totalCredits;

        resultLabel.setText(String.format(
                "예상 평점: %.2f / 4.5   |   총 이수 학점: %d학점",
                gpa,
                totalCredits
        ));
    }

    private void deleteSelectedCourse() {
        int selectedIndex = courseListView.getSelectionModel().getSelectedIndex();

        if (selectedIndex < 0) {
            showAlert("삭제할 과목을 선택하세요.");
            return;
        }

        courseGrades.remove(selectedIndex);
        courseListView.getItems().remove(selectedIndex);

        resultLabel.setText("예상 평점: -");
    }

    private double convertGradeToPoint(String grade) {
        return switch (grade) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            case "F" -> 0.0;
            default -> 0.0;
        };
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("입력 오류");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private VBox createBasePage() {
        VBox page = new VBox();
        page.setPadding(new Insets(20));
        page.setSpacing(20);
        page.setStyle("-fx-background-color: #d9d9d9; -fx-border-color: black; -fx-border-width: 2;");
        return page;
    }

    private Label createPageTitle(String text) {
        Label title = new Label(text);
        title.setFont(Font.font(28));
        return title;
    }

    private VBox createContentBox() {
        VBox box = new VBox();
        box.setSpacing(20);
        box.setPadding(new Insets(20));
        box.setPrefWidth(850);

        box.setStyle(
                "-fx-background-color: #eeeeee;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 10;" +
                        "-fx-background-radius: 10;"
        );

        return box;
    }

    private static class CourseGrade {
        private final String subject;
        private final int credit;
        private final String grade;

        public CourseGrade(String subject, int credit, String grade) {
            this.subject = subject;
            this.credit = credit;
            this.grade = grade;
        }

        public String getSubject() {
            return subject;
        }

        public int getCredit() {
            return credit;
        }

        public String getGrade() {
            return grade;
        }
    }
}