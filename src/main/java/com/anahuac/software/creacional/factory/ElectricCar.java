package com.anahuac.software.creacional.factory;
public class ElectricCar implements Car {
    @Override
    public void añadirCuerpo() {
        System.out.println("Añadiendo cuerpo de coche electrico");
    }

    @Override
    public void añadirPuertas() {
        System.out.println("Añadiendo puertas al coche electrico");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el coche electrico");
    }
}