package com.halconbit.dealership.jpa.maven.desktop.java;

import com.halconbit.dealership.jpa.maven.desktop.java.gui.Login;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Monthly Challenge No1. A car sales store needs a system that allows them to
 * perform a CRUD of all the vehicles they currently have for sale to then publish
 * them in a catalog.
 * Perform the corresponding modeling of the Automobile class, taking into account
 * the following data: id, model, brand, engine, color, license(Plate), numberOfDoors.
 * Implement the necessary methods to allow CRUD operations of each car.
 * IMPORTANT: Respect the layer model, separating the responsibility of each of
 * them: logic, graphical interface (If implemented) and persistence.
 * [=======]
 * [SPANISH]:
 * Desafío Mensual Nº1.
 * Una tienda de venta de automóviles necesita de un sistema que le permita realizar
 * un CRUD de todos los vehículos que tiene actualmente a la venta para luego
 * publicarlos en un catálogo.
 * Realizar el modelado correspondiente de la clase Automovil, teniendo en centa
 * los siguientes datos: id, modelo, marca, motor, color, patente(placa), cantidadPuertas.
 * Realizar los métodos necesarios para permitir las operaciones CRUD de cada automóvil.
 * IMPORTANTE: Respetar el modelo de capas, separando la responsabilidad de cada
 * una de ellas: lógica, interfaz gráfica (En caso de realizarla) y persistencia.
 */
public class DealershipJpaMavenDesktopJava {

    public static void main(String[] args) {
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
}
