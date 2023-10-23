package com.halconbit.dealership.jpa.maven.desktop.java.gui;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.Automobile;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Esteves
 */
public class Read extends javax.swing.JFrame {
    
    private Controller controller = null;
    private int        position   = 1;
    
    public Read() {
        this.controller = new Controller();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAutomobile = new javax.swing.JTable();
        panelActions = new javax.swing.JPanel();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        labelTitle.setText("Read Data");

        panelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableAutomobile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAutomobile);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelActions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(labelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // I check that the table is not empty.
        if(this.tableAutomobile.getRowCount() > 0) {
            // I check that a record has been selected.
            /**
             * -1 = No selected row
             */
            if(this.tableAutomobile.getSelectedRow() != -1) {
                /**
                 * <b>1</b> is <i>Column</i> <b>1</b> of <b>Customer number</b>
                 */
                int id    = Integer.parseInt(String.valueOf(this.tableAutomobile.getValueAt(this.tableAutomobile.getSelectedRow(), 1)));
                
                Edit edit = new Edit(id);
                edit.setVisible(true);
                edit.setLocationRelativeTo(null);
                
                this.dispose();
                
                loadTable();
                
            } else {
                showMessage("Not selected data at update.", JOptionPane.WARNING_MESSAGE, "Not selected data at update.");
            }
        } else {
            showMessage("Not exists data.", JOptionPane.ERROR_MESSAGE, "Not exists data.");
        }        
    }//GEN-LAST:event_buttonEditActionPerformed

    public void showMessage(String message, int type, String title) {
        JOptionPane optionPane = new JOptionPane(message);
        optionPane.setMessageType(type);
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(false);
        dialog.setVisible(true);
    }
    
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // I check that the table is not empty.
        if(this.tableAutomobile.getRowCount() > 0) {
            // I check that a record has been selected.
            /**
             * -1 = No selected row
             */
            if(this.tableAutomobile.getSelectedRow() != -1) {
                /**
                 * <b>1</b> is <i>Column</i> <b>1</b> of <b>Customer number</b>
                 */
                int id = Integer.parseInt(String.valueOf(this.tableAutomobile.getValueAt(this.tableAutomobile.getSelectedRow(), 1)));
                this.controller.deleteAutomobile(id);
                loadTable();
                showMessage("Delete successful.", JOptionPane.INFORMATION_MESSAGE, "Delete Successful.");
                
            } else {
                showMessage("Not selected data at delete.", JOptionPane.WARNING_MESSAGE, "Not selected data at delete.");
            }
        } else {
            showMessage("Not exists data.", JOptionPane.ERROR_MESSAGE, "Not exists data.");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadTable();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tableAutomobile;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        // Define the model we want the table to have.
        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            // Make rows and columns non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        // We set the column names.
        String titles[] = {"#", "Id", "Model", "Brand", "Engine", "Color", "License", "Number of doors"};
        defaultTableModel.setColumnIdentifiers(titles);
        
        // Loading data from the database.
        List<Automobile> listAutomobiles = this.controller.fetchingAutomobiles();
        
        // Iterate through the list and fetch each element in the table.
        if(listAutomobiles != null) {
            // Set variable.
            this.position = 1;
            for(Automobile automobile : listAutomobiles) {
                Object[] object = {this.position, automobile.getId(), automobile.getModel(), automobile.getBrand(), automobile.getEngine(), automobile.getColor(), automobile.getLicense(), automobile.getNumberOfDoors()};
                this.position++;
                
                defaultTableModel.addRow(object);
            }
        }
        
        this.tableAutomobile.setModel(defaultTableModel);
    }
}
