package com.anahuac.software.creacional.factory;
public class Pickup implements Car {
    @Override
    public void añadirCuerpo() {
        System.out.println("Añadiendo cuerpo pickup");
    }

    @Override
    public void añadirPuertas() {
        System.out.println("Añadiendo puertas pickup");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando pickup");
    }
}