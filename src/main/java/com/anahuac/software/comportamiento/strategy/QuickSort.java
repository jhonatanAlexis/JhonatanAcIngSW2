package com.anahuac.software.comportamiento.strategy;
public class QuickSort implements OrdenamientoStrategy {
    @Override
    public void ordenar(int[] array) {
        System.out.println("Ordenando con quickSort");
        imprimirArray(array);
    }

    private void imprimirArray(int[] array) {
        System.out.print("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}