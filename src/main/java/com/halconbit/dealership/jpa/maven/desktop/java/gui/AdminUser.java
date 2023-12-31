package com.halconbit.dealership.jpa.maven.desktop.java.gui;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Monthly Challenge No6 (April 2023).
 * Based on the <b>Login</b> we created in the March Challenge, a user management
 * system is required that allows registrations, removals, modifications and
 * reading of all existing users in a company.
 * For this, we will consider 2 types of users: one administrator "admin" and
 * another called "user" for a common user.
 * 1) The "admin" user will have access to:
 *    1.A) Viewing of all users regardless of their type.
 *    1.B) Possibility of registration, removal, modification and reading of any
 *         user and their permissions.
 * 2) The common user (user) will have access to:
 *    2.A) Only reading of all users that are of their same type (common user)
 * Make the corresponding modification in the Login application so that, if the
 * username and password are correct, instead of emitting a message, it allows or
 * not the access of each user to the available functionalities
 * <b>according to their assigned role.</b> As an extra, it is requested that on
 * the control screen of each user the name of the user of the session currently
 * initiated is shown at the top right.
 * Remember that, although the resolution of this exercise will be proposed in Java,
 * you can do it in any language you want.
 * [=======]
 * [SPANISH]:
 * Desafío Mensual Nº6 (Abril 2023).
 * A partir de la creación del <b>Login</b> que llevamos a cabo en el Desafío
 * de marzo, se necesita la creación de un sistema de administración de usuarios
 * que permita las altas, bajas, modificaciones y lectura de todos los existentes
 * en una empresa.
 * Para éste, tendremos en cuenta 2 tipos de uusarios: uno adminsitrador "admin"
 * y otro llamado "user" para un usario común.
 * 1) El usuario "admin" tendrá acceso a:
 *    1.A) Visualización de todos los usuarios sin importar su tipo.
 *    1.B) Posibilidad de alta, baja, modificación y lectura de cualquier usuario
 *         y sus permisos.
 * 2) El usuario común (user) tendrá acceso a:
 *    2.A) Solo la lectura de todos los usuarios que sean de su mismo tipo
 *         (usuario común).
 * Realizar la modificación correspondiente en la aplicación del Login para que,
 * en caso de ser correctooo usuario y contraseña, en lugar de emitir un mensaje,
 * permita o no el acceso a cada usuario a las funcionalidades disponibles
 * <b>según su rol asignado.</b>
 * Como extra se solicita que en la pantalla de control de cada usuario se muestre
 * arriba a la derecha el nombre delk usuario del que se encuentra actualmente
 * iniciada la sesión.
 * Recordar que, si bien la resolución de este ejercicio será propuesta en Java,
 * podés hacerla en cualquier lenguaje que quieras.
 */
public class AdminUser extends JFrame {
    
    private Controller controller;
    private int        position   = 1;
    
    public AdminUser() {
        initComponents();
    }

    public AdminUser(Controller controller) {
        initComponents();
        this.controller = controller;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonRefreshData = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        labelTitle.setText("Admin User");

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableUser.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tableUser);

        buttonAdd.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonRefreshData.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        buttonRefreshData.setText("Refresh data");
        buttonRefreshData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshDataActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        buttonExit.setText("Exit");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(buttonRefreshData, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(492, 492, 492))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRefreshData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadTable();
    }//GEN-LAST:event_formWindowOpened

    private void buttonRefreshDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshDataActionPerformed
        loadTable();
    }//GEN-LAST:event_buttonRefreshDataActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        
        AddUser addUser = new AddUser(this.controller);
        addUser.setVisible(true);
        addUser.setLocationRelativeTo(null);
        
        this.dispose();
                
        loadTable();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // I check that the table is not empty.
        if(this.tableUser.getRowCount() > 0) {
            // I check that a record has been selected.
            /**
             * -1 = No selected row
             */
            if(this.tableUser.getSelectedRow() != -1) {
                /**
                 * <b>1</b> is <i>Column</i> <b>1</b> of <b>User number</b>
                 */
                int id = Integer.parseInt(String.valueOf(this.tableUser.getValueAt(this.tableUser.getSelectedRow(), 1)));                
                this.controller.deleteUser(id);
                loadTable();
                showMessage("Delete successful.", JOptionPane.INFORMATION_MESSAGE, "Delete Successful.");
                
            } else {
                showMessage("Not selected data at delete.", JOptionPane.WARNING_MESSAGE, "Not selected data at delete.");
            }
        } else {
            showMessage("Not exists data.", JOptionPane.ERROR_MESSAGE, "Not exists data.");
        }        
                
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // I check that the table is not empty.
        if(this.tableUser.getRowCount() > 0) {
            // I check that a record has been selected.
            /**
             * -1 = No selected row
             */
            if(this.tableUser.getSelectedRow() != -1) {
                /**
                 * <b>1</b> is <i>Column</i> <b>1</b> of <b>User number</b>
                 */
                int id    = Integer.parseInt(String.valueOf(this.tableUser.getValueAt(this.tableUser.getSelectedRow(), 1)));
                
                EditUser editUser = new EditUser(this.controller, id);
                editUser.setVisible(true);
                editUser.setLocationRelativeTo(null);
                
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonRefreshData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tableUser;
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
        String titles[] = {"#", "Id", "User", "Rol"};
        defaultTableModel.setColumnIdentifiers(titles);
        
        // Loading data from the database.
        List<User> listUsers = this.controller.fetchingUsers();
        
        // Iterate through the list and fetch each element in the table.
        if(listUsers != null) {
            // Set variable.
            this.position = 1;
            for(User user : listUsers) {
                Object[] object = {this.position, user.getId(), user.getUsername(), user.getRol().getName()};
                this.position++;
                
                defaultTableModel.addRow(object);
            }
        }
        
        this.tableUser.setModel(defaultTableModel);
    }
}
