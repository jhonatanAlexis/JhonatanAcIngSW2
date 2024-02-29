package com.anahuac.software.parcial1.factoryQuiz;
public class DatabaseBStatementFactory implements StatementFactory {
    @Override
    public String create_statement(String _query) {
        return _query.toLowerCase();
    }
}