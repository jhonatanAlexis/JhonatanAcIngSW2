package com.anahuac.software.creacional.singleton;
public class LoggerSingleton{
    private static LoggerSingleton instance;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void logInfo(String _message) {
        logMessage("INFO", _message);
    }

    public void logWarning(String _message) {
        logMessage("WARNING", _message);
    }

    public void logError(String _message) {
        logMessage("ERROR", _message);
    }

    private void logMessage(String severity, String message) {
        System.out.println(severity + "- " + message);
    }
}