package com.halconbit.dealership.jpa.maven.desktop.java.gui;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Add extends javax.swing.JFrame {
    
    Controller controller = new Controller();
    
    public Add() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        labelModel = new javax.swing.JLabel();
        labelBrand = new javax.swing.JLabel();
        labelEngine = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelLicense = new javax.swing.JLabel();
        labelNumberOfDoors = new javax.swing.JLabel();
        textfieldModel = new javax.swing.JTextField();
        textfieldBrand = new javax.swing.JTextField();
        textfieldEngine = new javax.swing.JTextField();
        textfieldColor = new javax.swing.JTextField();
        textfieldLicense = new javax.swing.JTextField();
        textfieldNumberOfDoors = new javax.swing.JTextField();
        panelActions = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        labelTitle.setText("Add Automobile");

        panelForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelModel.setText("Model:");

        labelBrand.setText("Brand:");

        labelEngine.setText("Engine:");

        labelColor.setText("Color:");

        labelLicense.setText("License:");

        labelNumberOfDoors.setText("Number of doors:");

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumberOfDoors)
                    .addComponent(labelLicense, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelColor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEngine, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBrand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelModel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfieldModel)
                    .addComponent(textfieldBrand)
                    .addComponent(textfieldEngine)
                    .addComponent(textfieldColor)
                    .addComponent(textfieldLicense)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(textfieldNumberOfDoors, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModel)
                    .addComponent(textfieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBrand)
                    .addComponent(textfieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEngine)
                    .addComponent(textfieldEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(textfieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLicense)
                    .addComponent(textfieldLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumberOfDoors)
                    .addComponent(textfieldNumberOfDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelActions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonClean.setText("Clean");
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonClean, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(122, 122, 122))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelTitle)
                .addGap(26, 26, 26)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        
        String model         = this.textfieldModel.getText();
        String brand         = this.textfieldBrand.getText();
        String engine        = this.textfieldEngine.getText();
        String color         = this.textfieldColor.getText();
        String license       = this.textfieldLicense.getText();
        int    numberOfDoors = Integer.parseInt(this.textfieldNumberOfDoors.getText());
        
        this.controller.AddAutomobile(model, brand, engine, color, license, numberOfDoors);
        
        JOptionPane optionPane = new JOptionPane("Save successful");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog     dialog     =     optionPane.createDialog("Save Successful");
        dialog.setAlwaysOnTop(false);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        this.textfieldModel.setText("");
        this.textfieldBrand.setText("");
        this.textfieldEngine.setText("");
        this.textfieldColor.setText("");
        this.textfieldLicense.setText("");
        this.textfieldNumberOfDoors.setText("");
    }//GEN-LAST:event_buttonCleanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClean;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelEngine;
    private javax.swing.JLabel labelLicense;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelNumberOfDoors;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelForm;
    private javax.swing.JTextField textfieldBrand;
    private javax.swing.JTextField textfieldColor;
    private javax.swing.JTextField textfieldEngine;
    private javax.swing.JTextField textfieldLicense;
    private javax.swing.JTextField textfieldModel;
    private javax.swing.JTextField textfieldNumberOfDoors;
    // End of variables declaration//GEN-END:variables
}
