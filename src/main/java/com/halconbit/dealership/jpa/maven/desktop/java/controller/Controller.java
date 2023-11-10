package com.halconbit.dealership.jpa.maven.desktop.java.controller;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;
import com.halconbit.dealership.jpa.maven.desktop.java.persistence.Persistence;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class Controller {
    
    Persistence persistence = new Persistence();
    
    public void AddAutomobile(String model, String brand, String engine, String color, String license, int numberOfDoors) {
        
        Automobile automobile = new Automobile();
        automobile.setModel(model);
        automobile.setBrand(brand);
        automobile.setEngine(engine);
        automobile.setColor(color);
        automobile.setLicense(license);
        automobile.setNumberOfDoors(numberOfDoors);
        
        this.persistence.addAutomobile(automobile);
    }

    public List<Automobile> fetchingAutomobiles() {
        return this.persistence.fetchingAutomobiles();
    }

    public Automobile fetchingAutomobile(int id) {
        return this.persistence.fetchingAutomobile(id);
    }

    public void updateAutomobile(Automobile automobile, String model, String brand, String engine, String color, String license, int numberOfDoors) {
        
        automobile.setModel(model);
        automobile.setBrand(brand);
        automobile.setEngine(engine);
        automobile.setColor(color);
        automobile.setLicense(license);
        automobile.setNumberOfDoors(numberOfDoors);
        
        // Update automobile.
        this.persistence.updateAutomobile(automobile);
        
    }

    public void deleteAutomobile(int id) {
        this.persistence.deleteAutomobile(id);
    }

    public String validateUser(String user, String password) {
        
        String message = "";
        
        List<User> listUsers = this.persistence.fetchingUsers();
        for(User users : listUsers) {
            if(users.getUsername().equals(user)) {
                if(users.getPassword().equals(password)) {
                    message = "Exist.";
                    return message;
                } else {
                    message = "Password incorrect.";
                    return message;
                }
            } else {
                message = "User not exist.";
            }
        }
        
        return message;
        
    }
    
    public boolean validateUserWithRol(String user, String password) {
        
        List<User> listUsers = this.persistence.fetchingUsers();
        for(User users : listUsers) {
            if(users.getUsername().equals(user)) {
                if(users.getPassword().equals(password)) {
                    return true;
                } else {                    
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return false;
        
    }
    
    public User validateUserWithRolAndObjectUser(String user, String password) {
        
        User userSingle      = null;
        List<User> listUsers = this.persistence.fetchingUsers();
        for(User users : listUsers) {
            if(users.getUsername().equals(user)) {
                if(users.getPassword().equals(password)) {
                    userSingle = users;
                    return userSingle;
                } else {                    
                    userSingle = users;
                    return userSingle;
                }
            } else {
                userSingle = null;
            }
        }
        
        return userSingle;
        
    }

    public String validateUserWithRolByName(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
