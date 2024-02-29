package com.anahuac.software.comportamiento.template;
import java.text.SimpleDateFormat;

public class JsonLogger extends LoggerTemplate {
    @Override
    protected String format_evento(Evento _evento) {
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time_format = new SimpleDateFormat("h:mm a");
        String formattedDate = date_format.format(_evento.getFecha());
        String formattedTime = time_format.format(_evento.getFecha());

        return String.format("[\n{\n    fecha: \"%s\",\n    hora: \"%s\",\n    tipo: \"%s\",\n    mensaje: \"%s\"\n},\n]", formattedDate, formattedTime, _evento.getTipo(), _evento.getMensaje());
    }

    @Override
    protected void write_log(String fe) {
        System.out.println("JSON logger: " + fe);
    }
}