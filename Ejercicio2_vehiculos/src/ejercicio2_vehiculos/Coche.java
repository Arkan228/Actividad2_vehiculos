package ejercicio2_vehiculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author omarmora
 */
public class Coche extends Vehiculo2 {

    private float ancho = (float) 2.7;
    private int largo = (int) 6;

    public Coche(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        super(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
        this.ancho = ancho;
        this.largo = largo;
    }

    public void verCoche() {
        int pasajerosfaltantes = getcapacidad() - getpasajeros();
        System.out.println("El Vehiculo es un Coche");
        System.out.println("El Coche mide " + largo + " de largo y " + ancho + " de ancho");
        System.out.println("Capacidad de pasajeros:" + getcapacidad());
        System.out.println("Numero de pasajeros a bordo:" + getpasajeros());
        System.out.println("Numero de ruedas:" + getruedas());
        System.out.println("Fecha de matriculacion:" + getfecha());
        System.out.println("Tipo de desplazamiento:" + getdesplazamiento());
        System.out.println("Tipo de combustible:" + getcombustible());
        System.out.println("Pasajeros faltantes: " + pasajerosfaltantes);
    }
}
