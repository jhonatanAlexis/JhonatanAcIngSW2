package com.anahuac.software.comportamiento.strategy;
public class OrdenamientoContext {
    private OrdenamientoStrategy estrategia;

    public void setEstrategia(OrdenamientoStrategy _estrategia) {
        this.estrategia = _estrategia;
    }

    public void ejecutarOrdenamiento(int[] array) {
        if (this.estrategia != null) {
            this.estrategia.ordenar(array);
        } else {
            System.out.println("No se ha establecido ninguna estrategia.");
        }
    }
}