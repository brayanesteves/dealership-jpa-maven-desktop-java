package com.halconbit.dealership.jpa.maven.desktop.java.persistence;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import com.halconbit.dealership.jpa.maven.desktop.java.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Automobile fetchingAutomobile(int id) {
        return this.automobileJpaController.findAutomobile(id);
    }

    public void updateAutomobile(Automobile automobile) {
        try {
            this.automobileJpaController.edit(automobile);
        } catch (Exception ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAutomobile(int id) {
        try {
            this.automobileJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
