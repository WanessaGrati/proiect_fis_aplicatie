package com.example.proiect_fis_aplicatie.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class registerController implements Initializable {

    @FXML
    private ImageView people;

    @FXML
    private TextField enterFirstname;

    @FXML
    private Label nullFirstname;

    @FXML
    private TextField enterLastname;

    @FXML
    private Label nullLastname;

    @FXML
    private TextField enterUsername;

    @FXML
    private Label nullUsername;

    @FXML
    private PasswordField enterPassword;

    @FXML
    private Label nullPassword;

    @FXML
    private PasswordField enterConfirmPassword;

    @FXML
    private Label nullConfirmPassword;

    @FXML
    private ComboBox selectRole;

    @FXML
    private Label nullRole;

    @FXML
    private TextField enterAddress;

    @FXML
    private Label nullAddress;

    @FXML
    private Label labelExistUser;

    @FXML
    private Label labelAccessCode;

    @FXML
    private TextField enterAccessCode;

    @FXML
    private Label wrongAccessCode;

    @FXML
    private Button buttonCreateAccount;

    @FXML
    private Button buttonBack;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File registerFile = new File("imagini/registration.png");
        Image registerImage = new Image(registerFile.toURI().toString());
        people.setImage(registerImage);
    }

    public void onSignUp(ActionEvent event) {
        String firstname = enterFirstname.getText();
        String lastname = enterLastname.getText();
        String username = enterUsername.getText();
        String password = enterPassword.getText();
        String confirmedPassword = enterConfirmPassword.getText();
        String role = "";
        String code = codeInput.getText();
    }
}
