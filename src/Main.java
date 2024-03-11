import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar dataAbertura = Calendar.getInstance();

        ContaCorrente contaCorrente = new ContaCorrente("Vinicius Pedro de Souza",
                1234, 789, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Vinicius Pedro de Souza",
                5678, 789, 2000.0, dataAbertura);

        ContaCorrente segundaContaCorrente = new ContaCorrente("John Paul Jones",
                5678, 790, 1500.0);
        ContaPoupanca segundaContaPoupanca = new ContaPoupanca("John Paul Jones",
                91011, 791, 3000.0, dataAbertura);

        ContaCorrente terceiraContaCorrente = new ContaCorrente("Gene Simmons",
                5678, 790, 1500.0);
        ContaPoupanca terceiraContaPoupanca = new ContaPoupanca("Gene Simmons",
                91011, 791, 3000.0, dataAbertura);


        System.out.println("Detalhes da Conta Corrente:");
        contaCorrente.mostrarDetalhesConta();
        System.out.println();

        System.out.println("Detalhes da Conta Poupança:");
        contaPoupanca.mostrarDetalhesConta();
        System.out.println();

        System.out.println("Detalhes da Segunda Conta Corrente:");
        segundaContaCorrente.mostrarDetalhesConta();
        System.out.println();

        System.out.println("Detalhes da Segunda Conta Poupança:");
        segundaContaPoupanca.mostrarDetalhesConta();
        System.out.println();

        System.out.println("Detalhes da Terceira Conta Corrente:");
        terceiraContaCorrente.mostrarDetalhesConta();
        System.out.println();

        System.out.println("Detalhes da Terceira Conta Poupança:");
        terceiraContaPoupanca.mostrarDetalhesConta();
        System.out.println();
    }
}
