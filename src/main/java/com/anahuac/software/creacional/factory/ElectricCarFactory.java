package com.anahuac.software.creacional.factory;
public class ElectricCarFactory implements CarFactory {
    @Override
    public Car createCar(String _model) {
        switch (_model.toLowerCase()) {
            case "basico":
                return new ElectricCar();
            case "medio":
                return new ElectricCar();
            case "alto":
                return new ElectricCar();
            default:
                throw new IllegalArgumentException("Invalid electric car model: " + _model);
        }
    }
}