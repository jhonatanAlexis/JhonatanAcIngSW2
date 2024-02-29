package com.anahuac.software.estructural.adapter;
import java.time.LocalDate;

public class EmpleadoLegacy {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;

    public EmpleadoLegacy(String _nombre, String _apellido, LocalDate fecha_nacimiento) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre + " + " + apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fecha_nacimiento;
    }
}