package com.halconbit.dealership.jpa.maven.desktop.java.persistence;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.Rol;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;
import com.halconbit.dealership.jpa.maven.desktop.java.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan Esteves
 */
public class Persistence {
    
    private AutomobileJpaController automobileJpaController = new AutomobileJpaController();
    private UserJpaController       userJpaController       = new UserJpaController();
    private RolJpaController        rolJpaController        = new RolJpaController();
    
    // <AUTOMOBILE> //
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
    // <AUTOMOBILE> //
    
    // <USER> //
    public List<User> fetchingUsers() {
        // findUserEntities() = "SELECT * FROM `user`;"
        return this.userJpaController.findUserEntities();
    }
    // </USER> //

    public List<Rol> fetchingRoles() {
        // findRolEntities() = "SELECT * FROM `rol`;"
        return this.rolJpaController.findRolEntities();
    }

    public void createUser(User user) {
        this.userJpaController.create(user);
    }

    public void deleteUser(int id) {
        try {
            this.userJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
