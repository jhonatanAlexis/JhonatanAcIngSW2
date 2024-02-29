package com.anahuac.software.comportamiento.template;
import java.text.SimpleDateFormat;

public class TxtLogger extends LoggerTemplate {
    @Override
    protected String format_evento(Evento _evento) {
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time_format = new SimpleDateFormat("h:mm a");
        String formated_date = date_format.format(_evento.getFecha());
        String formated_time = time_format.format(_evento.getFecha());

        return String.format("%s\t%s\t%s : \"%s\"", formated_date, formated_time, _evento.getTipo(), _evento.getMensaje());
    }

    @Override
    protected void write_log(String _fe) {
        System.out.println("TXT logger: " + _fe);
    }
}