package com.example.algoritmos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class singUpController {
    Serializar s=new Serializar();
    @FXML
    TextField user,password,pV;
    @FXML void singUpB(ActionEvent e){
        if (password.getText().equals(pV.getText())){
            Usersinfo a=new Usersinfo(user.getText(),password.getText());
            s.serializar(a,user.getText());
        }

    }
    @FXML void backLogin() throws IOException {
        FXMLLoader cargar=new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene scene=new Scene(cargar.load());
        Stage stage=(Stage) pV.getScene().getWindow();
        stage.setScene(scene);
    }
}
