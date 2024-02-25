import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.Titular;

public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente("Vinicius Pedro De Souza", 790, 789,500.00);
        Conta contaPoupanca= new ContaPoupanca("Vinicius Pedro de Souza", 791, 789,2000.00);

        //System.out.println("Informações do Titular da Conta: ");

        System.out.println("************************************");
        System.out.println("Informações da sua Conta Corrente: ");
        ((ContaCorrente) contaCorrente).mostrarDetalhesContaCorrente();
        System.out.println("************************************");
        System.out.println("Informações da sua Conta Poupanca:  ");
        ((ContaPoupanca) contaPoupanca).mostrarDetalhesContaPoupanca();

    }
}
