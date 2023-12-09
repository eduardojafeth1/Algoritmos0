package com.example.algoritmos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.time.LocalDateTime;

public class addController {
    Serializar s=new Serializar();
    @FXML void Registrar(ActionEvent e){
        Usersinfo u=s.desSerializarUser("hola");
        Movimiento m=new Movimiento("activo","comida", LocalDateTime.now(),200,"hola");
        u.cuenta.l.insert(m);



    }
}
