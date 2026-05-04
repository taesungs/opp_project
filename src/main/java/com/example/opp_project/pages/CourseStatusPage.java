package com.example.opp_project.pages;

import com.example.opp_project.model.Course;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class CourseStatusPage {

    private final VBox view;

    public CourseStatusPage() {
        view = createBasePage();

        Label title = createPageTitle("이수현황");

        TableView<Course> table = createCourseTable();

        view.getChildren().addAll(title, table);
    }

    public VBox getView() {
        return view;
    }

    private TableView<Course> createCourseTable() {
        TableView<Course> table = new TableView<>();

        TableColumn<Course, String> yearColumn = new TableColumn<>("학년도");
        TableColumn<Course, String> semesterColumn = new TableColumn<>("학기");
        TableColumn<Course, String> nameColumn = new TableColumn<>("과목명");
        TableColumn<Course, String> typeColumn = new TableColumn<>("이수구분");
        TableColumn<Course, Integer> creditColumn = new TableColumn<>("학점");

        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
        semesterColumn.setCellValueFactory(new PropertyValueFactory<>("semester"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        creditColumn.setCellValueFactory(new PropertyValueFactory<>("credit"));

        yearColumn.setPrefWidth(120);
        semesterColumn.setPrefWidth(120);
        nameColumn.setPrefWidth(300);
        typeColumn.setPrefWidth(150);
        creditColumn.setPrefWidth(100);

        table.getColumns().addAll(
                yearColumn,
                semesterColumn,
                nameColumn,
                typeColumn,
                creditColumn
        );

        table.getItems().addAll(
                new Course("2024", "1학기", "프로그래밍기초", "전공", 3),
                new Course("2024", "2학기", "대학영어", "교양", 2),
                new Course("2025", "1학기", "자료구조", "전공", 3)
        );

        table.setPlaceholder(new Label("학번을 입력하면 이수 과목 목록이 표시됩니다."));
        table.setPrefHeight(400);

        return table;
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
}