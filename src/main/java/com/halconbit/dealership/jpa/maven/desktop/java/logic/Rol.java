package com.halconbit.dealership.jpa.maven.desktop.java.logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int        id;
    private String     name;
    private String     description;
    @OneToMany(mappedBy="rol")
    private List<User> listUsers;

    public Rol() {
    }

    public Rol(int id, String name, String description, List<User> listUsers) {
        this.id          = id;
        this.name        = name;
        this.description = description;
        this.listUsers   = listUsers;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getListUsers() {
        return this.listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }
    
    
    
}
