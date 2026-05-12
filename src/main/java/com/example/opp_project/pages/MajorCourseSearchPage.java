package com.example.opp_project.pages;

import com.example.opp_project.domain.course.MajorCourse;
import com.example.opp_project.service.course.MajorCourseService;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MajorCourseSearchPage {

    private final VBox view;
    private final ObservableList<MajorCourse> courses;
    private final MajorCourseService majorCourseService;

    public MajorCourseSearchPage() {
        this.majorCourseService = new MajorCourseService();
        this.courses = FXCollections.observableArrayList(majorCourseService.findAll());
        this.view = createView();
    }

    public VBox getView() {
        return view;
    }

    private VBox createView() {
        Label title = new Label("2026학년도 전공 과목 조회");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Label subTitle = new Label("소프트웨어학부, 컴퓨터정보공학부, 정보융합학부, 로봇학부 전공 교과목 기준");
        subTitle.setStyle("-fx-font-size: 14px; -fx-text-fill: #666666;");

        ComboBox<String> departmentBox = new ComboBox<>();
        departmentBox.getItems().addAll(
                "전체",
                "정보융합학부",
                "소프트웨어학부",
                "컴퓨터정보공학부",
                "로봇학부"
        );
        departmentBox.setValue("전체");

        ComboBox<String> gradeBox = new ComboBox<>();
        gradeBox.getItems().addAll("전체", "1학년", "2학년", "3학년", "4학년");
        gradeBox.setValue("전체");

        ComboBox<String> semesterBox = new ComboBox<>();
        semesterBox.getItems().addAll("전체", "1학기", "2학기");
        semesterBox.setValue("전체");

        ComboBox<String> typeBox = new ComboBox<>();
        typeBox.getItems().addAll("전체", "전필", "전선");
        typeBox.setValue("전체");

        TextField searchField = new TextField();
        searchField.setPromptText("교과목명 검색");
        searchField.setPrefWidth(220);

        HBox filterBox = new HBox(10);
        filterBox.setAlignment(Pos.CENTER_LEFT);
        filterBox.getChildren().addAll(
                new Label("학과"), departmentBox,
                new Label("학년"), gradeBox,
                new Label("학기"), semesterBox,
                new Label("이수구분"), typeBox,
                searchField
        );

        TableView<MajorCourse> tableView = new TableView<>();
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.setPrefHeight(520);

        TableColumn<MajorCourse, String> departmentCol = new TableColumn<>("학과");
        departmentCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getDepartment())
        );

        TableColumn<MajorCourse, Integer> gradeCol = new TableColumn<>("학년");
        gradeCol.setCellValueFactory(cellData -> {
            Integer grade = cellData.getValue().getGrade();

            if (grade == null) {
                return new SimpleObjectProperty<>(null);
            }

            return new SimpleIntegerProperty(grade).asObject();
        });

        TableColumn<MajorCourse, Integer> semesterCol = new TableColumn<>("학기");
        semesterCol.setCellValueFactory(cellData -> {
            Integer semester = cellData.getValue().getSemester();

            if (semester == null) {
                return new SimpleObjectProperty<>(null);
            }

            return new SimpleIntegerProperty(semester).asObject();
        });

        TableColumn<MajorCourse, String> typeCol = new TableColumn<>("이수구분");
        typeCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getType())
        );

        TableColumn<MajorCourse, String> nameCol = new TableColumn<>("교과목명");
        nameCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getName())
        );
        nameCol.setPrefWidth(260);

        TableColumn<MajorCourse, String> competencyCol = new TableColumn<>("전공역량");
        competencyCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getCompetency())
        );

        TableColumn<MajorCourse, Integer> creditCol = new TableColumn<>("학점");
        creditCol.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>(cellData.getValue().getCredit())
        );

        TableColumn<MajorCourse, Integer> hourCol = new TableColumn<>("시간");
        hourCol.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>(cellData.getValue().getHour())
        );

        TableColumn<MajorCourse, String> noteCol = new TableColumn<>("비고");
        noteCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getNote())
        );
        noteCol.setPrefWidth(260);

        tableView.getColumns().addAll(
                departmentCol,
                gradeCol,
                semesterCol,
                typeCol,
                nameCol,
                competencyCol,
                creditCol,
                hourCol,
                noteCol
        );

        FilteredList<MajorCourse> filteredCourses = new FilteredList<>(courses, course -> true);
        tableView.setItems(filteredCourses);

        Runnable updateFilter = () -> filteredCourses.setPredicate(course -> {
            String selectedDepartment = departmentBox.getValue();
            String selectedGrade = gradeBox.getValue();
            String selectedSemester = semesterBox.getValue();
            String selectedType = typeBox.getValue();
            String keyword = searchField.getText();

            boolean matchesDepartment = selectedDepartment.equals("전체")
                    || course.getDepartment().equals(selectedDepartment);

            boolean matchesGrade = selectedGrade.equals("전체")
                    || (course.getGrade() != null && selectedGrade.equals(course.getGrade() + "학년"));

            boolean matchesSemester = selectedSemester.equals("전체")
                    || (course.getSemester() != null && selectedSemester.equals(course.getSemester() + "학기"));

            boolean matchesType = selectedType.equals("전체")
                    || course.getType().equals(selectedType);

            boolean matchesKeyword = keyword == null
                    || keyword.isBlank()
                    || course.getName().toLowerCase().contains(keyword.toLowerCase());

            return matchesDepartment
                    && matchesGrade
                    && matchesSemester
                    && matchesType
                    && matchesKeyword;
        });

        departmentBox.setOnAction(event -> updateFilter.run());
        gradeBox.setOnAction(event -> updateFilter.run());
        semesterBox.setOnAction(event -> updateFilter.run());
        typeBox.setOnAction(event -> updateFilter.run());
        searchField.textProperty().addListener((observable, oldValue, newValue) -> updateFilter.run());

        VBox root = new VBox(15);
        root.setPadding(new Insets(25));
        root.getChildren().addAll(title, subTitle, filterBox, tableView);

        return root;
    }
}