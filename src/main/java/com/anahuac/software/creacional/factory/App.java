package com.anahuac.software.creacional.factory;

public class App {
    public static void main(String[] args) {
        CarFactory sedan_factory = new SedanCarFactory();
        CarFactory electric_factory = new ElectricCarFactory();
        CarFactory pickup_factory = new PickupFactory();

        Car sedan_basic = sedan_factory.createCar("basico");
        assembleCar(sedan_basic);

        Car electric_medium = electric_factory.createCar("medio");
        assembleCar(electric_medium);

        Car pickup_high = pickup_factory.createCar("alto");
        assembleCar(pickup_high);
    }

    private static void assembleCar(Car car) {
        System.out.println("Ensamblando coche:");
        car.añadirCuerpo();
        car.añadirPuertas();
        car.pintar();
        System.out.println("Emsamblado completado.\n");
    }
}