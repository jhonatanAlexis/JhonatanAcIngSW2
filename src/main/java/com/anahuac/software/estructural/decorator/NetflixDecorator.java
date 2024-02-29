package com.anahuac.software.estructural.decorator;
public class NetflixDecorator extends DecoradorServicio {
    public NetflixDecorator(PlanTelefonia _planTelefonia) {
        super(_planTelefonia);
    }

    @Override
    public int costo_mensual() {
        return super.costo_mensual() + 50;
    }
}