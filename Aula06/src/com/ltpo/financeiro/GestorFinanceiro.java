package com.ltpo.financeiro;
import java.util.ArrayList;
import java.util.List;
public class GestorFinanceiro {
    public List<Transacao> transacoes;
    public GestorFinanceiro() {
        this.transacoes = new ArrayList<>();
    }
    public void adicionarTransacao(String descricao, Double valor, Transacao.TipoTransacao tipo) {
        Transacao transacao = new Transacao(descricao, valor, tipo);
        transacoes.add(transacao);
    }
    public void listarTransacoes() {
        System.out.println("\n=== RELATÓRIO DE TRANSAÇÕES ===");
        System.out.printf("%-20s | %-10s | %10s\n", "Descrição", "Tipo", "Valor");
        System.out.println("------------------------------------------");
        for (Transacao t : transacoes) {
            System.out.printf("%-20s | %-10s | %10.2f\n", t.getDescricao(), t.getTipo(), t.getValor());
        }
    }
    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo() == Transacao.TipoTransacao.RECEITA) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}