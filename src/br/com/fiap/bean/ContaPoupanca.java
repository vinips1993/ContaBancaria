package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {
    private float taxa;
    private static final float rendimento = 0.05f;

    public ContaPoupanca(String nomeTitular, int numero, int agencia, double saldo, Calendar taxa) {
        super(nomeTitular, numero, agencia, saldo);
        this.taxa = TAXA;
    }
    @Override
    public void depositar(double deposito) {
        super.depositar(deposito);
    }
    @Override
    public void retirar(double saque) {
        if (getSaldo() >= saque) {
            super.retirar(saque + taxa);
        } else {
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + getSaldo());
        }
    }

    public double calculaRetornoInvestimento() {
        return getSaldo() * rendimento;
    }

    public void mostrarDetalhesContaPoupanca() {
        System.out.println("Nome do Titular: " + getNomeTitular());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa: " + taxa);
    }
}
