package com.example.algoritmos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewController {
    @FXML
    TextField user;
    @FXML
    Button b;
    @FXML
    PasswordField password;

    @FXML public void Login(ActionEvent e){

     if (user.getText().equals("David") & password.getText().equals("1234")){
         user.setPromptText("hola");

     }

    }
}
