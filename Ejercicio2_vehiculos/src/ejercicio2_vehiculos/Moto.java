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
public class Moto extends Vehiculo2 {
    private int tanque=(int)20;
    private float peso = (float) 200;

    public Moto(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        super(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
        this.peso = peso;

    }

    public void verMoto() {
        int pasajerosfaltantes = getcapacidad() - getpasajeros();
        System.out.println("El Vehiculo es una Moto");
        System.out.println("La motocicleta pesa: " + peso + " Kg aproximadamente y tiene un tanque de gasolina de "+tanque+" litros");
        System.out.println("Capacidad de pasajeros:" + getcapacidad());
        System.out.println("Numero de pasajeros a bordo:" + getpasajeros());
        System.out.println("Numero de ruedas:" + getruedas());
        System.out.println("Fecha de matriculacion:" + getfecha());
        System.out.println("Tipo de desplazamiento:" + getdesplazamiento());
        System.out.println("Tipo de combustible:" + getcombustible());
        System.out.println("Pasajeros faltantes: " + pasajerosfaltantes);
    }
}
