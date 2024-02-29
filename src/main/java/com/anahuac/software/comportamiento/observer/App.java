package com.anahuac.software.comportamiento.observer;
public class App {
    public static void main(String[] args) {
        ArticuloObservable articulo = new ArticuloObservable("Cel", 8000);

        Observer navegador_observer = new NavegadorObserver();
        Observer correo_observer = new CorreoObserver();
        Observer whatsapp_observer = new WhatsAppObserver();

        articulo.agregarObservador(navegador_observer);
        articulo.agregarObservador(correo_observer);
        articulo.agregarObservador(whatsapp_observer);

        articulo.actualizarPrecio(750); 
        articulo.actualizarPrecio(780); 
        articulo.actualizarPrecio(800); 
        articulo.actualizarPrecio(700); 
    }
}
