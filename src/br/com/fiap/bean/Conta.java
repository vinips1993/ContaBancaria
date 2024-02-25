package br.com.fiap.bean;

public class Conta {
    private String nomeTitular;

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

    private int numero;
    private int agencia;

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

    private double saldo;

    public Conta(String nomeTitular, int numero, int agencia, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    // Este método realiza um saque de um determinado valor da conta bancária, desde que o saldo seja suficiente.
    public void sacar(double saque) {
        // Verifica se o saldo atual da conta é suficiente para o saque solicitado.
        if (saldo >= saque) {
            // Se o saldo for suficiente, o saque é realizado com sucesso.
            System.out.println("Saque efetuado com sucesso: " + saque);
            // Atualiza o saldo deduzindo o valor do saque.
            saldo -= saque;
        } else {
            // Se o saldo não for suficiente, exibe uma mensagem de saldo insuficiente.
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + saldo);
        }
    }


    public void mostrarDetalhesConta() {
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }

}
