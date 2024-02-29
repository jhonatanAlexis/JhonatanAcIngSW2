package com.anahuac.software.estructural.decorator;
public class InternetDecorator extends DecoradorServicio {
    public InternetDecorator(PlanTelefonia _planTelefonia) {
        super(_planTelefonia);
    }

    @Override
    public int costo_mensual() {
        return super.costo_mensual() + 250;
    }
}