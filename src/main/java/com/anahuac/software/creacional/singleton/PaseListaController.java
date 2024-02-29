package com.anahuac.software.creacional.singleton;
public class PaseListaController {
    private LoggerSingleton logger = LoggerSingleton.getInstance();

    public void registrarAsistencia(String _nombre, boolean _asistio, String _justificacion) {
        if (_asistio) {
            logger.logInfo(_nombre + " asistio a clase");
        } else {
            if (_justificacion != null && !_justificacion.isEmpty()) {
                logger.logWarning(_nombre + " tiene justificación: " + _justificacion);
            } else {
                logger.logError(_nombre + " no asistio a clase");
            }
        }
    }

    public static void main(String[] args) {
        PaseListaController controller = new PaseListaController();

        controller.registrarAsistencia("Jhonatan", true, null);
        controller.registrarAsistencia("Marcos", false, "Cita médica");
        controller.registrarAsistencia("Laura", false, null);
    }
}
