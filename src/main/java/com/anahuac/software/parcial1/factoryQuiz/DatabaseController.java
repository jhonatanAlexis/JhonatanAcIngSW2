package com.anahuac.software.parcial1.factoryQuiz;
public class DatabaseController {
    private final StatementFactory statement_factory;

    public DatabaseController(StatementFactory _statementFactory) {
        this.statement_factory = _statementFactory;
    }

    public void executeQuery(String _query) {
        System.out.println("Abrir conexión");

        String formattedQuery = statement_factory.create_statement(_query);
        System.out.println("Ejecutar sentencia: " + formattedQuery);

        System.out.println("Cerrar conexion");
    }
}