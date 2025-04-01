package com.ltpo.funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Funcionario("Ana", 3000.0, 170),
            new Funcionario("Carlos", 2800.0, 160),
            new Funcionario("Mariana", 3500.0, 180),
            new Funcionario("João", 2500.0, 155),
        };
        System.out.println("\nRelatório de Funcionários: ");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
        }
    }
}
