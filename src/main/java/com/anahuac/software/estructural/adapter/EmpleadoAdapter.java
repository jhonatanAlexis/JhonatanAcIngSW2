package com.anahuac.software.estructural.adapter;
import java.time.LocalDate;
import java.time.Period;

public class EmpleadoAdapter implements Empleado {
    private EmpleadoLegacy empleado_legacy;

    public EmpleadoAdapter(EmpleadoLegacy EmpleadoLegacy) {
        this.empleado_legacy = EmpleadoLegacy;
    }

    @Override
    public String getNombre() {
        return empleado_legacy.getNombre();
    }

    @Override
    public int getEdad() {
        LocalDate fecha_nacimiento = empleado_legacy.getFechaNacimiento();
        LocalDate now = LocalDate.now();
        return Period.between(fecha_nacimiento, now).getYears();
    }
}