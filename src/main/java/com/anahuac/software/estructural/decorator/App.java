package com.anahuac.software.estructural.decorator;
public class App {
    public static void main(String[] args) {
        PlanTelefonia planBase = new PlanTelefoniaBase();
        PlanTelefonia planConInternet = new InternetDecorator(planBase);
        PlanTelefonia planConNetflix = new NetflixDecorator(planConInternet);
        PlanTelefonia planConTodos = new HBODecorator(new DisneyDecorator(new PrimeDecorator(planConNetflix)));

        System.out.println("Costo mensual total: " + planConTodos.costo_mensual());
    }
}
