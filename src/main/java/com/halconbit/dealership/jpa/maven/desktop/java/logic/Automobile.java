package com.halconbit.dealership.jpa.maven.desktop.java.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automobile implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int    id;
    private String model;
    private String brand;
    private String engine;
    private String color;
    private String license;
    private int    numberOfDoors;

    public Automobile() {
    }

    public Automobile(int id, String model, String brand, String engine, String color, String license, int numberOfDoors) {
        this.id            = id;
        this.model         = model;
        this.brand         = brand;
        this.engine        = engine;
        this.color         = color;
        this.license       = license;
        this.numberOfDoors = numberOfDoors;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    
    
}
