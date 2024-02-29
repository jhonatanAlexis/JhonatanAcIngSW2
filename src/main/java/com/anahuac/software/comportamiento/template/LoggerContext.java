package com.anahuac.software.comportamiento.template;
public class LoggerContext {
    private LoggerTemplate logger;

    public void setLogger(LoggerTemplate _logger) {
        this.logger = _logger;
    }

    public void log(Evento _evento) {
        if (this.logger != null) {
            this.logger.log(_evento);
        } else {
            System.out.println("No logger");
        }
    }
}