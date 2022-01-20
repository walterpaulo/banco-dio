package br.com.dio.model;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;
    public ContaPoupanca() {
        super(this.AGENCIA_PADRAO, SEQUENCIAL++);
    }
}
