package com.example.algoritmos;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Account implements Serializable {
    Llist<Movimiento> l;
    double saldo=0;

    public Account() {
    }





    public double actualizarSaldo(){
        for (int i=0;l.length()>i;i++){
            l.moveToPos(i);
            saldo+=l.getValue().getMonto();
        }
        return saldo;
    }

    public Llist<Movimiento> filterCategoria(Llist<Movimiento> l, String c){
        Llist<Movimiento>  filterlist=new Llist<>();
        for (int i=0;l.length()>i;i++){
            if(l.getValue().getCategoria().equals(c)){
                filterlist.insert(l.getValue());
            }
        }
        return filterlist;
    }
    public Llist<Movimiento> filterdate(Llist<Movimiento> l, LocalDateTime c){
        Llist<Movimiento>  filterlist=new Llist<>();
        for (int i=0;l.length()>i;i++){
            if(l.getValue().getFecha().equals(c)){
                filterlist.insert(l.getValue());
            }
        }
        return filterlist;
    }
}
