package com.anahuac.software.comportamiento.observer;
import java.util.ArrayList;
import java.util.List;

public class ArticuloObservable {
    private String nombre;
    private double precio_actual;
    private List<Observer> observadores = new ArrayList<>();

    public ArticuloObservable(String _nombre, double _precioInicial) {
        this.nombre = _nombre;
        this.precio_actual = _precioInicial;
    }

    public void agregarObservador(Observer _observador) {
       this.observadores.add(_observador);
    }

    public void quitarObservador(Observer _observador) {
        this.observadores.remove(_observador);
    }

    public void actualizarPrecio(double nuevo_precio) {
        if (nuevo_precio != this.precio_actual) {
            this.precio_actual = nuevo_precio;
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(this.nombre, this.precio_actual);
        }
    }
}