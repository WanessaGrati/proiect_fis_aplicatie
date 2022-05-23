package com.example.proiect_fis_aplicatie.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    @FXML
    private ImageView homeCleaner;

    @FXML
    private ImageView locker;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logoFile = new File("imagini/logo.png");
        Image logoImage = new Image(logoFile.toURI().toString());
        homeCleaner.setImage(logoImage);

        File lockerFile = new File("imagini/locker.png");
        Image lockerImage = new Image(lockerFile.toURI().toString());
        locker.setImage(lockerImage);
    }
}
