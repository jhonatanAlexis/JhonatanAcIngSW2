package com.anahuac.software.estructural.adapter;
public class EmpleadoNuevo implements Empleado {
    private String nombre;
    private int edad;

    public EmpleadoNuevo(String _nombre, int _edad) {
        this.nombre = _nombre;
        this.edad = _edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}