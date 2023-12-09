package com.example.algoritmos;
import com.example.algoritmos.Serializar;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application{

    public static void main(String[] args)  {
        Serializar s=new Serializar();
        Llist<Movimiento> list = new Llist();//s.desSerializar();
        Movimiento m1=new Movimiento("activo","comida",200);
        Movimiento m2=new Movimiento("activo","comida",100);
        Movimiento m3=new Movimiento("activo","comida", 300);
        list.insert(m1);
        list.insert(m2);
        list.insert(m3);
        list.moveToStart();
        list.getValue().getValue();
        list.next();
        list.getValue().getValue();
        list.next();
        list.getValue().getValue();
        System.out.println(list.length());
        Usersinfo u=s.desSerializarUser("hola");


        u.cuenta.l.getValue().getValue();
        //launch();
    }

  @Override
    public void start(Stage stage) throws Exception {
        stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene root = new Scene(fxmlLoader.load());
        Image icono=new Image(getClass().getResource("descarga.png").openStream());
        stage.getIcons().add(icono);
        stage.setScene(root);
        stage.show();
    }
}
