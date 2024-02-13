package lk.ijse.hostelMangement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    private AnchorPane homepagePane;

    @FXML
    private Button resrvationBtn;

    @FXML
    private Button roomBtn;

    @FXML
    private Button studentBtn;

    @FXML
    private Button userBtn;

    @FXML
    void resrvationBtnOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane= FXMLLoader.load(getClass().getResource("/view/reservation.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage=(Stage)homepagePane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("User Management");
        stage.centerOnScreen();

    }

    @FXML
    void roomBtnOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane= FXMLLoader.load(getClass().getResource("/view/room.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage=(Stage)homepagePane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Room Management");
        stage.centerOnScreen();


    }

    @FXML
    void studentBtnOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane= FXMLLoader.load(getClass().getResource("/view/student.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage=(Stage)homepagePane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Student Management");
        stage.centerOnScreen();

    }

    @FXML
    void userBtnOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane= FXMLLoader.load(getClass().getResource("/view/user.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage=(Stage)homepagePane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("User Management");
        stage.centerOnScreen();

    }

}
