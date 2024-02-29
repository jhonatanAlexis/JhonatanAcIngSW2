package com.anahuac.software.estructural.decorator;
public abstract class DecoradorServicio implements PlanTelefonia {
    protected PlanTelefonia plan_telefonia;

    public DecoradorServicio(PlanTelefonia _planTelefonia) {
        this.plan_telefonia = _planTelefonia;
    }

    @Override
    public int costo_mensual() {
        return plan_telefonia.costo_mensual();
    }
}