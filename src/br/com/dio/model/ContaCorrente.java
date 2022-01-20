package br.com.dio.model;

public class ContaCorrente extends Conta {
    private static int SEQUENCIAL = 1;
    public ContaCorrente() {
        super(this.AGENCIA_PADRAO, SEQUENCIAL++);
    }
}

