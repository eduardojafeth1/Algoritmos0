package com.example.algoritmos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class homeController {
    @FXML
    Label amountShow;
    @FXML
    Label CategoriaShow;
    @FXML
    Label dateShow;
    @FXML
    VBox vBox1;
    @FXML
    ChoiceBox categoriafilter;
    @FXML
    DatePicker desde,hasta;

    @FXML
    void charge(ActionEvent e) {
        VBox vb=new VBox();
        Label l=new Label();
        Serializar s = new Serializar();
        Llist<Movimiento> list = s.desSerializarUser("hola").cuenta.l;
        for (int i = 0; i < 10; i++) {

        }
        l.setText(list.getValue().getCategoria());
        vb.getChildren().add(l);
        vBox1.getChildren().setAll(vb);
        /*amountShow.setText(amountShow.getText() + list.getValue().getMonto());
        CategoriaShow.setText(CategoriaShow.getText() + list.getValue().getCategoria());
        dateShow.setText(dateShow.getText() + list.getValue().getFecha());*/
    }
    @FXML
    void filter(ActionEvent e){

    }
    @FXML void anadir(ActionEvent e) throws IOException {
        VBox vb=new VBox();
        vb=FXMLLoader.load(getClass().getResource("addMovimiento.fxml"));
        vBox1.getChildren().setAll(vb);
    }
}
