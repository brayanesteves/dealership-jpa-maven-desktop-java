package com.halconbit.dealership.jpa.maven.desktop.java.controller;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import com.halconbit.dealership.jpa.maven.desktop.java.persistence.Persistence;

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
    
}
