package com.ltpo.financeiro;

public class Main {
    public static void main(String[] args) {
        GestorFinanceiro gestor = new GestorFinanceiro();
        gestor.adicionarTransacao("Salário", 5000.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Freelance", 1200.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Aluguel", 1500.0, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Supermercado", 600.0, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Internet", 100.0, Transacao.TipoTransacao.DESPESA);
        gestor.listarTransacoes();
        System.out.printf("\nSaldoFinal: R$ %.2f\n", gestor.calcularSaldo());
    }
}
