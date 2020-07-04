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
public class Vehiculo2 {

    private int capacidad, pasajeros, ruedas;
    private String fecha, desplazamiento, combustible;

    public Vehiculo2(int capacidad, int pasajeros, int ruedas, String fecha, String desplazamiento, String combustible) {
        this.capacidad = capacidad;
        this.combustible = combustible;
        this.desplazamiento = desplazamiento;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
        this.ruedas = ruedas;
    }

    public int getcapacidad() {
        return capacidad;
    }

    public int getpasajeros() {
        return pasajeros;
    }

    public int getruedas() {
        return ruedas;
    }

    public String getfecha() {
        return fecha;
    }

    public String getdesplazamiento() {
        return desplazamiento;
    }

    public String getcombustible() {
        return combustible;
    }

}
