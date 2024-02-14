package lk.ijse.hostelMangement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostelMangement.bo.BOFactory;
import lk.ijse.hostelMangement.bo.custom.UserBO;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

//    private UserBO userBO=(UserBO) BOFactory.getBO(BOFactory.BOTypes.USER);

    @FXML
    private Button btnLogin;

    @FXML
    private ToggleButton btnShow;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private Label msgLbl;

    @FXML
    private Label shownPass;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLoginOnActionx(ActionEvent event) {

    }

    @FXML
    void btnShowOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
