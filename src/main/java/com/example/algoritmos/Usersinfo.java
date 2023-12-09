package com.example.algoritmos;

import java.io.Serializable;

public class Usersinfo implements Serializable {
    Account cuenta=new Account();

    public void setCuenta(Account cuenta) {
        this.cuenta = cuenta;
    }

    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usersinfo(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
