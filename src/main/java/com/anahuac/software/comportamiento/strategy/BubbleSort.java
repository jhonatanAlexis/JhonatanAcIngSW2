package com.anahuac.software.comportamiento.strategy;
public class BubbleSort implements OrdenamientoStrategy {
    @Override
    public void ordenar(int[] array) {
        System.out.println("Ordenando con bubbleSort");
        imprimir_array(array);
    }

    private void imprimir_array(int[] array) {
        System.out.print("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}