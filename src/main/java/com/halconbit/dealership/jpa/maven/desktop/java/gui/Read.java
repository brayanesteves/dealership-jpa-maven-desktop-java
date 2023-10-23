package com.halconbit.dealership.jpa.maven.desktop.java.gui;

/**
 *
 * @author Brayan Esteves
 */
public class Read extends javax.swing.JFrame {

    public Read() {
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
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteActionPerformed

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
}
