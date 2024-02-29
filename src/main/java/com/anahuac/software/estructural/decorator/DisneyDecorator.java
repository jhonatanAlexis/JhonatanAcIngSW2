package com.anahuac.software.estructural.decorator;
public class DisneyDecorator extends DecoradorServicio {
    public DisneyDecorator(PlanTelefonia _planTelefonia) {
        super(_planTelefonia);
    }

    @Override
    public int costo_mensual() {
        return super.costo_mensual() + 100;
    }
}