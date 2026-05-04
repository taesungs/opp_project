package com.example.opp_project.pages;

import com.example.opp_project.domain.requirement.GraduationRequirement;
import com.example.opp_project.domain.requirement.MultiMajorOption;
import com.example.opp_project.domain.requirement.MultiMajorRequirement;
import com.example.opp_project.domain.requirement.MultiMajorType;
import com.example.opp_project.domain.requirement.Requirement;
import com.example.opp_project.service.GraduationRequirementService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class HomePage {

    private final VBox view;

    private final GraduationRequirementService graduationRequirementService =
            new GraduationRequirementService();

    private GraduationRequirement currentGraduationRequirement;

    private TextField studentIdField;
    private Label studentInfoLabel;

    private Label graduationRequirementLabel;
    private ComboBox<String> multiMajorYesNoComboBox;
    private ComboBox<String> multiMajorTypeComboBox;
    private Label multiMajorDetailLabel;

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
                createGraduationRequirementBox()
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

    private VBox createGraduationRequirementBox() {
        VBox wrapper = new VBox();
        wrapper.setSpacing(5);

        Label title = new Label("졸업요건");
        title.setFont(Font.font(24));

        graduationRequirementLabel = new Label("학번을 입력하면 해당 학번/학과의 졸업요건이 표시됩니다.");
        graduationRequirementLabel.setFont(Font.font(16));
        graduationRequirementLabel.setWrapText(true);

        multiMajorYesNoComboBox = new ComboBox<>();
        multiMajorYesNoComboBox.getItems().addAll("아니오", "예");
        multiMajorYesNoComboBox.setPromptText("다전공 이수 여부 선택");
        multiMajorYesNoComboBox.setVisible(false);
        multiMajorYesNoComboBox.setManaged(false);
        multiMajorYesNoComboBox.setPrefWidth(220);

        multiMajorTypeComboBox = new ComboBox<>();
        multiMajorTypeComboBox.setPromptText("다전공 유형 선택");
        multiMajorTypeComboBox.setVisible(false);
        multiMajorTypeComboBox.setManaged(false);
        multiMajorTypeComboBox.setPrefWidth(260);

        multiMajorDetailLabel = new Label();
        multiMajorDetailLabel.setFont(Font.font(16));
        multiMajorDetailLabel.setWrapText(true);
        multiMajorDetailLabel.setVisible(false);
        multiMajorDetailLabel.setManaged(false);

        multiMajorYesNoComboBox.setOnAction(e -> handleMultiMajorYesNoSelection());
        multiMajorTypeComboBox.setOnAction(e -> showSelectedMultiMajorRequirement());

        VBox contentBox = new VBox();
        contentBox.setSpacing(12);
        contentBox.setPadding(new Insets(15));
        contentBox.setPrefWidth(1000);
        contentBox.setStyle(
                "-fx-background-color: #eeeeee;" +
                        "-fx-border-color: black;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-radius: 14;" +
                        "-fx-background-radius: 14;"
        );

        contentBox.getChildren().addAll(
                graduationRequirementLabel,
                multiMajorYesNoComboBox,
                multiMajorTypeComboBox,
                multiMajorDetailLabel
        );

        ScrollPane scrollPane = new ScrollPane(contentBox);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(450);
        scrollPane.setStyle("-fx-background-color: transparent;");

        wrapper.getChildren().addAll(title, scrollPane);

        return wrapper;
    }

    private void searchStudent() {
        String studentId = studentIdField.getText().trim();

        if (!isValidStudentId(studentId)) {
            showAlert("학번은 숫자 10자리로 입력해야 합니다.");
            return;
        }

        try {
            int admissionYear = Integer.parseInt(studentId.substring(0, 4));
            String studentNumber = studentId.substring(2, 4);
            int departmentCode = Integer.parseInt(studentId.substring(4, 7));

            currentGraduationRequirement =
                    graduationRequirementService.findByStudent(admissionYear, departmentCode);

            studentInfoLabel.setText(
                    "학과: " + currentGraduationRequirement.getDepartment().getDepartmentName()
                            + "\t학번: " + studentNumber + "학번"
            );

            showGraduationRequirement(currentGraduationRequirement);

        } catch (Exception e) {
            clearRequirementArea();
            showAlert(e.getMessage());
        }
    }

    private void showGraduationRequirement(GraduationRequirement graduationRequirement) {
        StringBuilder builder = new StringBuilder();

        builder.append("학과: ")
                .append(graduationRequirement.getDepartment().getDepartmentName())
                .append("\n");

        builder.append("입학년도: ")
                .append(graduationRequirement.getDepartment().getAdmissionYear())
                .append("\n");

        builder.append("학과코드: ")
                .append(graduationRequirement.getDepartment().getDepartmentCode())
                .append("\n");

        builder.append("전체 졸업 필요 학점: ")
                .append(graduationRequirement.getRequiredTotalCredits())
                .append("학점\n\n");

        for (Requirement requirement : graduationRequirement.getRequirements()) {
            if (requirement instanceof MultiMajorRequirement) {
                continue;
            }

            builder.append("[")
                    .append(requirement.getRequirementName())
                    .append("]\n");

            builder.append(requirement.getDetailText())
                    .append("\n\n");
        }

        graduationRequirementLabel.setText(builder.toString());

        setupMultiMajorSelector(graduationRequirement);
    }

    private void setupMultiMajorSelector(GraduationRequirement graduationRequirement) {
        MultiMajorRequirement multiMajorRequirement =
                graduationRequirement.getMultiMajorRequirement();

        multiMajorYesNoComboBox.setValue(null);
        multiMajorTypeComboBox.setValue(null);
        multiMajorTypeComboBox.getItems().clear();
        multiMajorDetailLabel.setText("");

        multiMajorTypeComboBox.setVisible(false);
        multiMajorTypeComboBox.setManaged(false);

        multiMajorDetailLabel.setVisible(false);
        multiMajorDetailLabel.setManaged(false);

        if (multiMajorRequirement == null) {
            multiMajorYesNoComboBox.setVisible(false);
            multiMajorYesNoComboBox.setManaged(false);
            return;
        }

        multiMajorYesNoComboBox.setVisible(true);
        multiMajorYesNoComboBox.setManaged(true);

        if (multiMajorRequirement.isMultiMajorRequired()) {
            multiMajorYesNoComboBox.setValue("예");
            multiMajorYesNoComboBox.setDisable(true);

            showMultiMajorTypeSelector(multiMajorRequirement);

            multiMajorDetailLabel.setVisible(true);
            multiMajorDetailLabel.setManaged(true);
            multiMajorDetailLabel.setText("이 학번은 다전공 이수가 필수입니다. 다전공 유형을 선택하세요.");
        } else {
            multiMajorYesNoComboBox.setDisable(false);

            multiMajorDetailLabel.setVisible(true);
            multiMajorDetailLabel.setManaged(true);
            multiMajorDetailLabel.setText("다전공은 필수가 아니며, 선택적으로 이수할 수 있습니다.");
        }
    }

    private void handleMultiMajorYesNoSelection() {
        if (currentGraduationRequirement == null) {
            return;
        }

        String selected = multiMajorYesNoComboBox.getValue();

        if (selected == null) {
            return;
        }

        MultiMajorRequirement multiMajorRequirement =
                currentGraduationRequirement.getMultiMajorRequirement();

        if (multiMajorRequirement == null) {
            return;
        }

        if (selected.equals("예")) {
            showMultiMajorTypeSelector(multiMajorRequirement);

            multiMajorDetailLabel.setVisible(true);
            multiMajorDetailLabel.setManaged(true);
            multiMajorDetailLabel.setText("다전공 유형을 선택하면 해당 졸업요건이 표시됩니다.");
            return;
        }

        if (multiMajorRequirement.isMultiMajorRequired()) {
            multiMajorYesNoComboBox.setValue("예");
            showMultiMajorTypeSelector(multiMajorRequirement);

            multiMajorDetailLabel.setVisible(true);
            multiMajorDetailLabel.setManaged(true);
            multiMajorDetailLabel.setText("이 학번은 다전공 이수가 필수입니다. 다전공 유형을 선택하세요.");
            return;
        }

        multiMajorTypeComboBox.setVisible(false);
        multiMajorTypeComboBox.setManaged(false);
        multiMajorTypeComboBox.setValue(null);

        multiMajorDetailLabel.setVisible(true);
        multiMajorDetailLabel.setManaged(true);
        multiMajorDetailLabel.setText("다전공을 선택하지 않았습니다.");
    }

    private void showMultiMajorTypeSelector(MultiMajorRequirement multiMajorRequirement) {
        multiMajorTypeComboBox.getItems().clear();

        for (MultiMajorOption option : multiMajorRequirement.getOptions()) {
            multiMajorTypeComboBox.getItems().add(option.getType().getDisplayName());
        }

        multiMajorTypeComboBox.setVisible(true);
        multiMajorTypeComboBox.setManaged(true);
    }

    private void showSelectedMultiMajorRequirement() {
        if (currentGraduationRequirement == null) {
            return;
        }

        String selectedTypeName = multiMajorTypeComboBox.getValue();

        if (selectedTypeName == null) {
            return;
        }

        MultiMajorRequirement multiMajorRequirement =
                currentGraduationRequirement.getMultiMajorRequirement();

        if (multiMajorRequirement == null) {
            return;
        }

        MultiMajorType selectedType =
                MultiMajorType.fromDisplayName(selectedTypeName);

        MultiMajorOption selectedOption =
                multiMajorRequirement.findOption(selectedType);

        multiMajorDetailLabel.setVisible(true);
        multiMajorDetailLabel.setManaged(true);
        multiMajorDetailLabel.setText(selectedOption.getDetailText());
    }

    private boolean isValidStudentId(String studentId) {
        return studentId.matches("\\d{10}");
    }

    private void clearRequirementArea() {
        currentGraduationRequirement = null;

        graduationRequirementLabel.setText("학번을 입력하면 해당 학번/학과의 졸업요건이 표시됩니다.");

        multiMajorYesNoComboBox.setValue(null);
        multiMajorYesNoComboBox.setVisible(false);
        multiMajorYesNoComboBox.setManaged(false);

        multiMajorTypeComboBox.setValue(null);
        multiMajorTypeComboBox.getItems().clear();
        multiMajorTypeComboBox.setVisible(false);
        multiMajorTypeComboBox.setManaged(false);

        multiMajorDetailLabel.setText("");
        multiMajorDetailLabel.setVisible(false);
        multiMajorDetailLabel.setManaged(false);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("입력 오류");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}