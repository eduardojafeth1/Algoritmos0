package com.example.algoritmos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    Serializar s=new Serializar();
    Usersinfo u;
    @FXML
    TextField user;
    @FXML
    Button b;
    @FXML
    PasswordField password;

    @FXML public void Login(ActionEvent e) throws IOException {
        u=s.desSerializarUser(user.getText());
        System.out.println(u.password+u.username);

     if (user.getText().equals(u.getUsername()) & password.getText().equals(u.getPassword())){
         FXMLLoader cargar=new FXMLLoader(getClass().getResource("home.fxml"));
         Scene scene=new Scene(cargar.load());
         Stage stage=(Stage) b.getScene().getWindow();
         stage.setScene(scene);

     }

    }
    @ FXML public void singUp(ActionEvent e) throws IOException {
        FXMLLoader cargar=new FXMLLoader(getClass().getResource("singUp.fxml"));
        Scene scene=new Scene(cargar.load());
        Stage stage=(Stage) b.getScene().getWindow();
        stage.setScene(scene);

    }
}
