package com.anahuac.software.creacional.singleton;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private static String status;

    private LoggerSingleton(String _status){};

    public static LoggerSingleton getInstance(String _status){
        if(instance == null){
            status = _status;
            instance = new LoggerSingleton(status);
        }
        return instance;
    }

    public void log(){
        if(status == "Falta"){
            this.logError();
        } else if(status == "Asistencia"){
            this.logInfo();
        }else if(status == "Justificante"){
            this.logWarning();
        }
    }

    public void logInfo(){
        System.out.println("Info. El alumno tiene asistencia");
    }

    public void logError(){
        System.out.println("Error. El alumno tiene falta");
    }

    public void logWarning(){
        System.out.println("Warning. El alumno tiene justificacion");
    }
}
