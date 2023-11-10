package com.halconbit.dealership.jpa.maven.desktop.java.util;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import com.halconbit.dealership.jpa.maven.desktop.java.gui.AdminUser;
import com.halconbit.dealership.jpa.maven.desktop.java.gui.Login;
import com.halconbit.dealership.jpa.maven.desktop.java.gui.Main;
import com.halconbit.dealership.jpa.maven.desktop.java.gui.Read;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;

/**
 *
 * @author Brayan Esteves
 */
public class HandleLogin {
    
    private Controller controller = new Controller();
    
    public String validateUser(String user, String password) {
        String message = controller.validateUser(user, password);
        if(message.equals("Exist.")) {
            Main main = new Main();
            main.setVisible(true);
            main.setLocationRelativeTo(null);
            
            return message;
        } else {
            return message;
        }
    }
    
    public int validateUserWithRol(String user, String password) {
        int     status  = 0;
        User userSingle = this.controller.validateUserWithRolAndObjectUser(user, password);
        Login login     = new Login();
        if(userSingle != null) {
            String rol = userSingle.getRol().getName();
            if(rol.equals("admin")) {
                Main main = new Main(this.controller, userSingle);
                main.setVisible(true);
                main.setLocationRelativeTo(null);
                status = 1;
                login.dispose();
            }
            
            if(rol.equals("user")) {
                Read read = new Read(this.controller, userSingle);
                read.setVisible(true);
                read.setLocationRelativeTo(null);
                status = 2;
                login.dispose();
            }
            
        } else {
            status = 0;
        }
        
        return status;
    }
    
}
