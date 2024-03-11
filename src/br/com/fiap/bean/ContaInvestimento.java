package br.com.fiap.bean;

public interface ContaInvestimento {
    float RENDIMENTO = 0.05F;
    float TAXA = 10.0F;

    void depositar(double valor);

    double getSaldo();
}
