package com.anahuac.software.parcial1.factoryQuiz;
public class Main {
    public static void main(String[] args) {
        DatabaseController controllerA = new DatabaseController(new DatabaseAStatementFactory());
        DatabaseController controllerB = new DatabaseController(new DatabaseBStatementFactory());
        DatabaseController controllerC = new DatabaseController(new DatabaseCStatementFactory());

        controllerA.executeQuery("SELECT * FROM table_name");
        controllerB.executeQuery("SELECT * FROM table_name");
        controllerC.executeQuery("SELECT * FROM table_name");
    }
}
