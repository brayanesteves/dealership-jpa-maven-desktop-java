package com.halconbit.dealership.jpa.maven.desktop.java.controller;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
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
    
}
