package br.com.fiap.bean;

public class Titular {

    private String Nome;
    private String CPF;
    private String EMAIL;

    public Titular(String nome, String CPF, String EMAIL) {
        Nome = nome;
        this.CPF = CPF;
        this.EMAIL = EMAIL;
    }

    void mostrarDetalhesTitular(){
        System.out.println("Nome do Titular: " +Nome);
        System.out.println("Número do CPF: " +CPF);
        System.out.println("Email do Titular: " +EMAIL);
    }

}
