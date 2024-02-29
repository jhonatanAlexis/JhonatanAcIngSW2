package com.anahuac.software.comportamiento.template;
import java.util.Date;

public class Evento {
    private Date fecha;
    private String tipo;
    private String mensaje;

    public Evento(Date _fecha, String _tipo, String _mensaje) {
        this.fecha = _fecha;
        this.tipo = _tipo;
        this.mensaje = _mensaje;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}