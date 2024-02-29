package com.anahuac.software.creacional.factory;
public class SedanCarFactory implements CarFactory {
    @Override
    public Car createCar(String _model) {
        switch (_model.toLowerCase()) {
            case "basico":
                return new SedanCar();
            case "medio":
                return new SedanCar();
            case "alto":
                return new SedanCar();
            default:
                throw new IllegalArgumentException("Modelo de carro sedan invalido: " + _model);
        }
    }
}