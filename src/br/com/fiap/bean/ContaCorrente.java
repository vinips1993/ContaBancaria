package br.com.fiap.bean;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeTitular, int numero, int agencia, double saldo) {
        super(nomeTitular, numero, agencia, saldo);
    }

    public void mostrarDetalhesContaCorrente() {
        System.out.println("Nome do Titular: " + getNomeTitular());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
    }
}
