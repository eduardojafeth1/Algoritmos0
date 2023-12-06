package com.example.algoritmos;

import java.time.LocalDateTime;

public class Movimiento {
    String tipo;
    String categoria;
    LocalDateTime fecha;
    double monto;
    Movimiento(String type,String Cate,double amount){
        this.tipo=type;
        this.categoria=Cate;
        this.monto=amount;
    }
    public void getValue(){
        System.out.println("tipo: "+tipo+"\nCategoria: "+categoria+"\nmonto: "+monto);
    }


}
