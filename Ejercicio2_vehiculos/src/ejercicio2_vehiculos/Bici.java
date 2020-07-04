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
public class Bici extends Vehiculo2 {

    private int rodada = (int) 24;
    private int velocidades = (int) 18;

    public Bici(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        super(capacidad, pasajeros, ruedas, fecha, desplazamiento, combustible);
        this.rodada=rodada;
        this.velocidades=velocidades;
    }

    public void verBici() {
        int pasajerosfaltantes = getcapacidad() - getpasajeros();
        System.out.println("El Vehiculo es una Bicicleta");
        System.out.println("La Bicleta es rodada " + rodada + " y es de " + velocidades + " velocidades");
        System.out.println("Capacidad de pasajeros:" + getcapacidad());
        System.out.println("Numero de pasajeros a bordo:" + getpasajeros());
        System.out.println("Numero de ruedas:" + getruedas());
        System.out.println("Fecha de matriculacion:" + getfecha());
        System.out.println("Tipo de desplazamiento:" + getdesplazamiento());
        System.out.println("Tipo de combustible:" + getcombustible());
        System.out.println("Pasajeros faltantes: " + pasajerosfaltantes);
    }
}
