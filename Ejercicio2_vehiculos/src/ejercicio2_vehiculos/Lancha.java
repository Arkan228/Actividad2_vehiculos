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
public class Lancha extends Vehiculo2 {

    private int proa=(int) 1;
    private int popa=(int) 2;
    
    public Lancha(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        super(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
    }

    public void verLancha() {
        int pasajerosfaltantes = getcapacidad() - getpasajeros();
        System.out.println("El Vehiculo es una Lancha");
        System.out.println("La proa del barco mide " +proa+ " metros y la popa mide " +popa+ " metros");
        System.out.println("Capacidad de pasajeros:" + getcapacidad());
        System.out.println("Numero de pasajeros a bordo:" + getpasajeros());
        System.out.println("Numero de ruedas:" + getruedas());
        System.out.println("Fecha de matriculacion:" + getfecha());
        System.out.println("Tipo de desplazamiento:" + getdesplazamiento());
        System.out.println("Tipo de combustible:" + getcombustible());
        System.out.println("Pasajeros faltantes: " + pasajerosfaltantes);
    }
}
