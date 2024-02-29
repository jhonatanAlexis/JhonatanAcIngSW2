package com.anahuac.software.comportamiento.template;
import java.util.Date;

public class LoggerTemplateExample {
    public static void main(String[] args) {
        LoggerContext c = new LoggerContext();

        Evento evento = new Evento(new Date(), "INFO", "holaaaaa");

        c.setLogger(new TxtLogger());
        c.log(evento);

        c.setLogger(new CsvLogger());
        c.log(evento);

        c.setLogger(new JsonLogger());
        c.log(evento);
    }
}