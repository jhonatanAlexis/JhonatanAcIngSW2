package com.anahuac.software.comportamiento.strategy;
public class App {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 7, 1, 9, 5};

        OrdenamientoContext contexto = new OrdenamientoContext();

        contexto.setEstrategia(new BubbleSort());
        contexto.ejecutarOrdenamiento(numeros.clone());

        contexto.setEstrategia(new QuickSort());
        contexto.ejecutarOrdenamiento(numeros.clone());

        contexto.setEstrategia(new MergeSort());
        contexto.ejecutarOrdenamiento(numeros.clone());

        contexto.setEstrategia(new InsertionSort());
        contexto.ejecutarOrdenamiento(numeros.clone());
    }
}
