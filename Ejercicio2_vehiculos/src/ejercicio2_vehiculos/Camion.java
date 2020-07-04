/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_vehiculos;

/**
 *
 * @author omarmora
 */
public class Camion extends Vehiculo2 {

    private int remolques = (getruedas()-4) / 4;

    public Camion(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        super(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
        this.remolques = remolques;

    }

    public void verCamion() {
        int pasajerosfaltantes = getcapacidad() - getpasajeros();
        System.out.println("El Vehiculo es un Camion");
        System.out.println("El camion trae " + remolques + " remolque(s) cargando");
        System.out.println("Capacidad de pasajeros:" + getcapacidad());
        System.out.println("Numero de pasajeros a bordo:" + getpasajeros());
        System.out.println("Numero de ruedas:" + getruedas());
        System.out.println("Fecha de matriculacion:" + getfecha());
        System.out.println("Tipo de desplazamiento:" + getdesplazamiento());
        System.out.println("Tipo de combustible:" + getcombustible());
        System.out.println("Pasajeros faltantes: " + pasajerosfaltantes);
    }
}
