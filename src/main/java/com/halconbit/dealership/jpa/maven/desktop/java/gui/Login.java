package com.halconbit.dealership.jpa.maven.desktop.java.gui;

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
 *    (Where usario must be replaced by the name of the user).
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
 *    en un área de texto (Donde usario debe ser reemplazado por el nombre del usario).
 * 3) Si el usuario es incorrecto, debe dar a conocer dicha situación.
 * 4) Establecer como usuario y contraseña correctos los siguientes:
 *    Usuario: admin
 *    Contraseña: 123Prueba
 * <b>Recordar que,</b> si bien la interfaz gráfica de prueba está desarrollada
 * en Java, podés hacerla en cualquier lenguaje que quieras. De igual manera,
 * se puede utilizar base de datos para los datos de <b>login</b> como así también
 * datos lógicos (Dependiendo de los conocimientos que tengas).
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
