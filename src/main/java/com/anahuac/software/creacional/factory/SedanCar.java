package com.anahuac.software.creacional.factory;
public class SedanCar implements Car {
    @Override
    public void añadirCuerpo() {
        System.out.println("Añadiendo cuerpo de sedan");
    }

    @Override
    public void añadirPuertas() {
        System.out.println("Añadiendo puertas al sedan");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el sedan");
    }
}