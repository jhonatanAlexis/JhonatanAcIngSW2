package com.anahuac.software.estructural.decorator;
public class PrimeDecorator extends DecoradorServicio {
    public PrimeDecorator(PlanTelefonia _planTelefonia) {
        super(_planTelefonia);
    }

    @Override
    public int costo_mensual() {
        return super.costo_mensual() + 50;
    }
}