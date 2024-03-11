package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta  {
    private String nomeTitular;
    private int numero;
    private int agencia;
    private double saldo;
    private Calendar dataAbertura;

    public Conta(String nomeTitular, int numero, int agencia, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = Calendar.getInstance();
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void retirar(double saque) {
        if (saldo >= saque) {
            System.out.println("Saque efetuado com sucesso: " + saque);
            saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente para retirada. Saldo atual: " + saldo);
        }
    }

    public void mostrarDetalhesConta() {
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura.getTime());
    }
}
