package com.anahuac.software.comportamiento.template;


public abstract class LoggerTemplate {
    public void log(Evento _evento) {
        String formated_event = format_evento(_evento);
        write_log(formated_event);
    }

    protected abstract String format_evento(Evento _evento);

    protected abstract void write_log(String _formattedEvent);
}