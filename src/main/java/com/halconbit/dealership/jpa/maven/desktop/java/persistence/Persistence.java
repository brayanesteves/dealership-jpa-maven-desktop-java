package com.halconbit.dealership.jpa.maven.desktop.java.persistence;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;

/**
 *
 * @author Brayan Esteves
 */
public class Persistence {
    
    AutomobileJpaController automobileJpaController = new AutomobileJpaController();

    public void addAutomobile(Automobile automobile) {
        this.automobileJpaController.create(automobile);
    }
    
}
