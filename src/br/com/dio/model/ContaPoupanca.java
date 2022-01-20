package br.com.dio.model;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;
    public ContaPoupanca(Cliente cliente) {
        super(cliente, SEQUENCIAL++);
    }

    @Override
    public void imprimrExtrato() {
        System.out.println("==============Conta Poupança==============");
        super.imprimirInfosComun();
    }



}
