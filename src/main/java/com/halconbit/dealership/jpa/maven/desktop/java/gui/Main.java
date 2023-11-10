package com.halconbit.dealership.jpa.maven.desktop.java.gui;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;
import javax.swing.JFrame;

/**
 *
 * @author Brayan Esteves
 */
public class Main extends JFrame {
    
    private Controller controller;
    private User       user;
    
    public Main() {
        initComponents();
    }

    public Main(Controller controller) {
        initComponents();
        this.controller = controller;
    }

    public Main(Controller controller, User userSingle) {
        initComponents();
        this.controller = controller;
        this.user       = userSingle;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelActions = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonReadEditDelete = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonAdminUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        jLabel1.setText("Car sales.");

        panelActions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonReadEditDelete.setText("Read, Edit and Delete");
        buttonReadEditDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReadEditDeleteActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonAdminUser.setText("Admin User");
        buttonAdminUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReadEditDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonReadEditDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonReadEditDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReadEditDeleteActionPerformed
        
        Read read = new Read(this.controller, this.user);
        read.setVisible(true);
        read.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_buttonReadEditDeleteActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        Add add = new Add();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonAdminUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminUserActionPerformed
        AdminUser adminUser = new AdminUser(this.controller);
        adminUser.setVisible(true);
        adminUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonAdminUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle("Welcome to menu: " + this.user.getUsername());
        if(this.user.getRol().getName().equals("admin")) {
            this.buttonAdd.setVisible(true);
            this.buttonAdminUser.setVisible(true);
            this.buttonReadEditDelete.setVisible(true);
        }
        
        if(this.user.getRol().getName().equals("user")) {
            this.buttonAdd.setVisible(false);
            this.buttonAdminUser.setVisible(false);
            this.buttonReadEditDelete.setVisible(true);
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAdminUser;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonReadEditDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
