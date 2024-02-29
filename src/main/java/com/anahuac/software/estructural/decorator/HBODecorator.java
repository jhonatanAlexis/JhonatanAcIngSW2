package com.anahuac.software.estructural.decorator;
public class HBODecorator extends DecoradorServicio {
    public HBODecorator(PlanTelefonia _planTelefonia) {
        super(_planTelefonia);
    }

    @Override
    public int costo_mensual() {
        return super.costo_mensual() + 100;
    }
}