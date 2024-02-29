package com.anahuac.software.estructural.decorator;
public class PlanTelefoniaBase implements PlanTelefonia {
    @Override
    public int costo_mensual() {
        return 200;
    }
}