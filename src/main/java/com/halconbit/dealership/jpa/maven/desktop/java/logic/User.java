package com.halconbit.dealership.jpa.maven.desktop.java.logic;

import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int    id;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name="FK_ID_ROL")
    private Rol    rol;

    public User() {
    }

    public User(int id, String username, String password, Rol rol) {
        this.id       = id;
        this.username = username;
        this.password = password;
        this.rol      = rol;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }    
        
}