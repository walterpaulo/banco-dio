package br.com.dio.model;

public class ContaCorrente extends Conta {
    private static int SEQUENCIAL = 1;
    public ContaCorrente(Cliente cliente) {
        super(cliente, SEQUENCIAL++);
    }

    @Override
    public void imprimrExtrato() {
        System.out.println("==============Conta Corrent==============");
        super.imprimirInfosComun();
    }
}

