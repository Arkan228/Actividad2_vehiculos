/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_vehiculos;

import java.util.Scanner;

/**
 *
 * @author omarmora
 */
public class Ejercicio2_vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int x = 1; x <11; x++) {
            String fecha, desplazamiento, combustible;
            int capacidad, pasajeros, ruedas;
            Scanner leer = new Scanner(System.in);
            System.out.println("Vehiculo Numero: " + x);
            System.out.println("Ingresa Fecha de Matriculacion");
            fecha = leer.nextLine();
            System.out.println("Ingresa el Tipo de Dezplazamiento");
            desplazamiento = leer.nextLine();
            System.out.println("Ingresa Tipo de Combustible");
            combustible = leer.nextLine();
            System.out.println("Ingresa el Numero de Capacidad");
            capacidad = leer.nextInt();
            System.out.println("Ingresa el Numero de Pasajeros");
            pasajeros = leer.nextInt();
            System.out.println("Ingresa el Numero de Ruedas");
            ruedas = leer.nextInt();
            if (capacidad == 4 && (pasajeros > 0 && pasajeros < 5) && ruedas == 4) {
                Coche mostrar = new Coche(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
                mostrar.verCoche();
            }
            if (combustible.equals ("Gasolina") && capacidad == 2 && (pasajeros > 0 && pasajeros < 3) && ruedas == 2) {
                Moto mostrar = new Moto(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
                mostrar.verMoto();
            }
            if (capacidad == 2 && (pasajeros > 0 && pasajeros < 3) && ruedas > 4) {
                Camion mostrar = new Camion(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
                mostrar.verCamion();
            }
            if (combustible.equals ("Dinamico") && capacidad == 2 && (pasajeros > 0 && pasajeros < 3) && ruedas==2) {
                Bici mostrar = new Bici(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
                mostrar.verBici();
            }
            if (capacidad < 31 && (pasajeros > 0 && pasajeros < 32) && ruedas==0) {
                Lancha mostrar = new Lancha(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
                mostrar.verLancha();
            }
        }

    }
}