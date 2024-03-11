package br.com.fiap.bean;
import java.util.Calendar;

public class ContaCorrente extends Conta {
    private Calendar dataAbertura;

    public ContaCorrente(String nomeTitular, int numero, int agencia, double saldo) {
        super(nomeTitular, numero, agencia, saldo);
        this.dataAbertura = this.dataAbertura;
    }

    public void depositar(double deposito) {
        super.depositar(deposito);
    }

    public void retirar(double saque) {
        if (getSaldo() >= saque) {
            super.retirar(saque);
        } else {
            System.out.print("Saldo insuficiente para realizar o saque." + getSaldo());
        }
    }

    public void mostrarDetalhesContaCorrente() {
        System.out.println("Nome do Titular: " + getNomeTitular());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Data de Abertura: " + getDataAbertura().getTime());
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }
}
