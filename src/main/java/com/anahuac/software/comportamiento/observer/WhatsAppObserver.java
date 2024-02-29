package com.anahuac.software.comportamiento.observer;
public class WhatsAppObserver implements Observer {
    @Override
    public void actualizar(String nombre_articulo, double nuevo_precio) {
        System.out.println("Alerta: El precio de " + nombre_articulo + " ha alcanzado " + nuevo_precio);
    }
}