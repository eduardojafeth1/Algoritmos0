package com.example.algoritmos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;




public class Main extends Application {

    public static void main(String[] args) {
        launch();

        }

    @Override
    public void start(Stage stage) throws Exception {
        stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view.fxml"));
        Scene root = new Scene(fxmlLoader.load());
        Image icono=new Image(getClass().getResource("descarga.png").openStream());
        stage.getIcons().add(icono);
        stage.setScene(root);
        stage.show();
    }
}
