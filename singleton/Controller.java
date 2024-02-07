package com.anahuac.software.creacional.singleton;

public class Controller {
    public static void main(String[] args){
        LoggerSingleton ls = LoggerSingleton.getInstance("Justificante");
        ls.log();
    }
}
