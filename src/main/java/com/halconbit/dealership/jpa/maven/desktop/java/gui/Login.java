package com.halconbit.dealership.jpa.maven.desktop.java.gui;

import com.halconbit.dealership.jpa.maven.desktop.java.controller.Controller;
import com.halconbit.dealership.jpa.maven.desktop.java.util.HandleLogin;
import javax.swing.JFrame;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * <b>Monthly Challenge Nº5 (March 2023).</b>
 * A Graphical User Interface (GUI) is needed for the login of an application.
 * 1) The GUI must have a text field for the <b>username</b> and another for the
 *    <b>password</b> (With their respective lables/tags).
 * 2) At the same time, a login button and another to clear the data are needed.
 *    By clicking the login button, it must verify if the user and password are correct;
 *    if so, it must manifest a greeting <b>"Welcome user"</ b> in a text area
 *    (Where user must be replaced by the name of the user).
 * 3) If the user is incorrect, it must make that situation known.
 * 4) Establish the following as correct user and password:
 *    User: admin
 *    Password: 123Test
 * <b>Remember that,</ b> although the test graphical interface is developed in
 * Java, you can do it in any language you want. Likewise, a database can be used
 * for login data as well as logical data (Depending on the knowledge you have).
 * [=======]
 * [SPANISH]:
 * <b>Desafio Mensual Nº5 (Marzo 2023).</b>
 * Se necesita una Interfaz Gráfica de Usuario (IGU) para el login de una aplicación.
 * 1) La IGU debe tener un campo de texto para el <b>nombre de usuario</b> y otro
 *    para la <b>contraseña</b> (Con sus respectivas lables/etiquetas).
 * 2) Al mismo tiempo, se necesita un botón de login y otro para limpiar los datos.
 *    Al hacer click en el botón de login, debe verificar si el usuario y contraseña
 *    son correctos; de ser así, debe manifestar un saludo <b>"Bienvenido usuario"</b>
 *    en un área de texto (Donde usuario debe ser reemplazado por el nombre del usario).
 * 3) Si el usuario es incorrecto, debe dar a conocer dicha situación.
 * 4) Establecer como usuario y contraseña correctos los siguientes:
 *    Usuario: admin
 *    Contraseña: 123Prueba
 * <b>Recordar que,</b> si bien la interfaz gráfica de prueba está desarrollada
 * en Java, podés hacerla en cualquier lenguaje que quieras. De igual manera,
 * se puede utilizar base de datos para los datos de <b>login</b> como así también
 * datos lógicos (Dependiendo de los conocimientos que tengas).
 */
public class Login extends JFrame {
    
    private HandleLogin handLogin;
    
    public Login() {        
        initComponents();
        this.handLogin = new HandleLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textfieldUsername = new javax.swing.JTextField();
        passwordfieldPassword = new javax.swing.JPasswordField();
        separatorNumberOne = new javax.swing.JSeparator();
        separatorNumberTwo = new javax.swing.JSeparator();
        panelActions = new javax.swing.JPanel();
        buttonClean = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        panelContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        labelTitle.setFont(new java.awt.Font("Lato", 1, 23)); // NOI18N
        labelTitle.setText("Login");

        labelUsername.setText("Username:");

        labelPassword.setText("Password:");

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername)
                    .addComponent(labelPassword))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordfieldPassword)
                    .addComponent(textfieldUsername))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(textfieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(passwordfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        separatorNumberOne.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        separatorNumberTwo.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        buttonClean.setText("Clean");
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(buttonClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContent.setToolTipText("");

        textareaMessage.setEditable(false);
        textareaMessage.setColumns(20);
        textareaMessage.setRows(5);
        jScrollPane1.setViewportView(textareaMessage);

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(labelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorNumberOne, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separatorNumberTwo))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separatorNumberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separatorNumberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        this.textfieldUsername.setText("");
        this.passwordfieldPassword.setText("");
        this.textareaMessage.setText("");
    }//GEN-LAST:event_buttonCleanActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        
        Controller controller = new Controller();
        
        String user           = this.textfieldUsername.getText();
        String password       = this.passwordfieldPassword.getText();
        
        int    status        = this.handLogin.validateUserWithRol(user, password);
        
        if(status == 0) {
            this.textareaMessage.setText("User or password incorrect.");
        }
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClean;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPasswordField passwordfieldPassword;
    private javax.swing.JSeparator separatorNumberOne;
    private javax.swing.JSeparator separatorNumberTwo;
    private javax.swing.JTextArea textareaMessage;
    private javax.swing.JTextField textfieldUsername;
    // End of variables declaration//GEN-END:variables
}
