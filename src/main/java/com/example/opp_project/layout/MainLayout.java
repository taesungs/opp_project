package com.example.opp_project.layout;

import com.example.opp_project.pages.*;
import com.example.opp_project.pages.CourseStatusPage;
import com.example.opp_project.pages.HomePage;
import com.example.opp_project.pages.LiberalRequirementPage;
import com.example.opp_project.pages.MajorRequirementPage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainLayout {

    private final BorderPane root;
    private final SideMenu sideMenu;

    public MainLayout() {
        root = new BorderPane();

        sideMenu = new SideMenu(this);

        root.setTop(createHeader());
        root.setLeft(sideMenu.getView());
    }

    public BorderPane getRoot() {
        return root;
    }

    private HBox createHeader() {
        HBox header = new HBox();
        header.setAlignment(Pos.CENTER_LEFT);
        header.setPadding(new Insets(20, 30, 20, 30));
        header.setStyle("-fx-background-color: #4b0020;");

        Label title = new Label("광운대학교 졸업요건 조회 서비스 (Kwangwoon Graduation Assistance System)");
        title.setTextFill(Color.WHITE);
        title.setFont(Font.font(24));

        header.getChildren().add(title);

        return header;
    }

    private void setPage(Node page) {
        root.setCenter(page);
    }

    public void showHomePage() {
        setPage(new HomePage().getView());
    }

    public void showMajorRequirementPage() {
        setPage(new MajorRequirementPage().getView());
    }

    public void showLiberalRequirementPage() {
        setPage(new LiberalRequirementPage().getView());
    }

    public void showCourseStatusPage() {
        setPage(new CourseStatusPage().getView());
    }

    public void showCreditCalculatorPage() {
        setPage(new com.example.opp_project.pages.CreditCalculatorPage().getView());
    }
}