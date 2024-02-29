package com.anahuac.software.creacional.factory;
public class PickupFactory implements CarFactory {
    @Override
    public Car createCar(String _model) {
        switch (_model.toLowerCase()) {
            case "basico":
                return new Pickup();
            case "medio":
                return new Pickup();
            case "alto":
                return new Pickup();
            default:
                throw new IllegalArgumentException("Invalid pickup model: " + _model);
        }
    }
}