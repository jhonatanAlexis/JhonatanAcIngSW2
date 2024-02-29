package com.anahuac.software.estructural.adapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Empleado empleadoNuevo1 = new EmpleadoNuevo("Jhonatan Alexis ", 21);
        Empleado empleadoNuevo2 = new EmpleadoNuevo("Alejandra Carolina ", 22);

        EmpleadoLegacy empleadoLegacy1 = new EmpleadoLegacy("Kevin", "Uriel ", LocalDate.of(2002, 5, 15));
        EmpleadoLegacy empleadoLegacy2 = new EmpleadoLegacy("Ana", "Maria ", LocalDate.of(2001, 8, 20));

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleadoNuevo1);
        empleados.add(empleadoNuevo2);
        empleados.add(new EmpleadoAdapter(empleadoLegacy1));
        empleados.add(new EmpleadoAdapter(empleadoLegacy2));

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + "y edad: " + empleado.getEdad() + " años");
        }
    }
}
