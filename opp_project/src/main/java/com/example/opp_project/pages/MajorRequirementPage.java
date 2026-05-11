package com.example.opp_project.pages;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MajorRequirementPage {

    private final VBox view;

    public MajorRequirementPage() {
        view = createBasePage();

        Label title = createPageTitle("전공요건");

        VBox contentBox = createContentBox();
        contentBox.getChildren().addAll(
                createSectionLabel("전공 필수"),
                new Label("전공 필수 과목 이수 여부를 표시합니다."),
                createSectionLabel("전공 선택"),
                new Label("전공 선택 학점 및 이수 과목을 표시합니다."),
                createSectionLabel("전공 학점 현황"),
                new Label("예시: 48 / 60 학점 이수")
        );

        view.getChildren().addAll(title, contentBox);
    }

    public VBox getView() {
        return view;
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

    private Label createSectionLabel(String text) {
        Label label = new Label(text);
        label.setFont(Font.font(22));
        return label;
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
}