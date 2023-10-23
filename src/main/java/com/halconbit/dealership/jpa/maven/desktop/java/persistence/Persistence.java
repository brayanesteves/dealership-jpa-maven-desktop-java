package com.halconbit.dealership.jpa.maven.desktop.java.persistence;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class Persistence {
    
    AutomobileJpaController automobileJpaController = new AutomobileJpaController();

    public void addAutomobile(Automobile automobile) {
        this.automobileJpaController.create(automobile);
    }

    public List<Automobile> fetchingAutomobiles() {
        return this.automobileJpaController.findAutomobileEntities();
    }
    
}
